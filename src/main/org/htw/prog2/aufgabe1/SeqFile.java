package org.htw.prog2.aufgabe1;

import java.util.HashSet;

public class SeqFile {
    
    /**
     * Reads the specified FASTA file and stores sequences. In case the file does not exist or is not a valid FASTA
     * file, the Constructor does not throw an Exception. Instead, isValid() on the resulting object will return false.
     * @param filename
     */
    public SeqFile(String filename) {
    }

    /**
     * Reads the specified FASTA file.
     * @param filename The path to the FASTA file
     * @return false if the file could not be parsed (wrong format, does not exist), true otherwise.
     */
    private boolean readFile(String filename) {
        return false;
    }

    /**
     * Adds the sequence in the passed StringBuilder to the internal list and also sets the first sequence if it
     * is still empty.
     * @param seq SequenceBuilder to get the sequence from.
     * @return The length of the added sequence.
     */
    private int addSequence(StringBuilder seq) {
        return -1;
    }

    public int getNumberOfSequences() {
        return -1;
    }

    public HashSet<String> getSequences() {
        return null;
    }

    public String getFirstSequence() {
        return null;
    }

    public boolean isValid() {
        return false;
    }
}
