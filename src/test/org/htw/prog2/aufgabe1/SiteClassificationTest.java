package org.htw.prog2.aufgabe1;

import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiteClassificationTest {

    @Test
    void parseOptions_requiredArguments() {
        assertNull(SiteClassification.parseOptions(new String[] {}));
        assertNull(SiteClassification.parseOptions(
                "-m data/NeanderthalMutationPatterns.csv -r data/HumanProteins.fasta".split(" ")));
        assertNotNull(SiteClassification.parseOptions(
                "-m data/NeanderthalMutationPatterns.csv -p data/site_sequences.fasta -r data/HumanProteins.fasta".
                        split(" ")));
    }

    @Test
    void parseOptions_argumentValues() {
        CommandLine cli = SiteClassification.parseOptions(
                "-m data/NeanderthalMutationPatterns.csv -p data/site_sequences.fasta -r data/HumanProteins.fasta ".
                        split(" "));
        assertEquals("data/NeanderthalMutationPatterns.csv", cli.getOptionValue('m'));
        assertEquals("data/site_sequences.fasta", cli.getOptionValue('p'));
        assertEquals("data/HumanProteins.fasta", cli.getOptionValue('r'));
    }

}