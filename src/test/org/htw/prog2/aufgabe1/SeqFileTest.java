package org.htw.prog2.aufgabe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeqFileTest {

    @Test
    void isValid_doesNotExist() {
        SeqFile seqfile = new SeqFile("data/DOESNOTEXIST");
        assertFalse(seqfile.isValid());
    }

    @Test
    void isValid_wrongFormat() {
        SeqFile seqfile = new SeqFile("data/GREB1_patterns.csv");
        assertFalse(seqfile.isValid());
    }

    @Test
    void isValid_correctFormat() {
        SeqFile seqfile = new SeqFile("data/GREB1_reference.fasta");
        assertTrue(seqfile.isValid());
    }

    @Test
    void getNumberOfSequences_wrongFormat() {
        SeqFile seqfile = new SeqFile("data/GREB1_patterns.csv");
        assertEquals(0, seqfile.getNumberOfSequences());
    }

    @Test
    void getNumberOfSequences_single() {
        SeqFile seqfile = new SeqFile("data/GREB1_reference.fasta");
        assertEquals(1, seqfile.getNumberOfSequences());
    }

    @Test
    void getNumberOfSequences_multiple() {
        SeqFile seqfile = new SeqFile("data/site_sequences.fasta");
        assertEquals(382, seqfile.getNumberOfSequences());
    }

    @Test
    void getSequences_wrongFormat() {
        SeqFile seqfile = new SeqFile("data/GREB1_patterns.csv");
        assertEquals(0, seqfile.getSequences().size());
    }

    @Test
    void getSequences_single() {
        SeqFile seqfile = new SeqFile("data/GREB1_reference.fasta");
        assertEquals(1, seqfile.getSequences().size());
        assertTrue(seqfile.getSequences().contains("MGNSYAGQLKTTRFEEVLHNSIEASLRSNNLVPRPIFSQLYLEAEQQLAALEGGSRVDNEEEEEEGEGGLETNGPPNPFQLHPLPEGCCTTDGFCQAGKDLRLVSISNEPMDVPAGFLLVGVKSPSLPDHLLVCAVDKRFLPDDNGHNALLGFSGNCVGCGKKGFCYFTEFSNHINLKLTTQPKKQKHLKYYLVRNAQGTLTKGPLICWKGSEFRSRQIPASTCSSSLFPALESTAAFPSEPVPGTNPSILMGAQQAGPASDHPSLNAAMGPAVFNGKDSPKCQQLAKNNLLALPRPSALGILSNSGPPKKRHKGWSPESPSAPDGGCPQGGGNRAKYESAGMSCVPQVGLVGPASVTFPVVASGEPVSVPDNLLKICKAKPVIFKGHGNFPYLCGNLNDVVVSPLLYTCYQNSQSVSRAYEQYGASAIQPISEEMQLLLTVYYLVQLAADQVPLMEDLEQIFLRSWRESHLTEIRQYQQAPPQPFPPAPSAAAPVTSAQLPWLASLAASSCNDSVHVIECAYSLAEGLSEMFRLLVEGKLAKTNYVVIICACRSAAIDSCIAVTGKYQARILSESLLTPAEYQKEVNYELVTGKVDSLGAFFSTLCPEGDIDILLDKFHQENQGHISSSLAASSVTKAASLDVSGTPVCTSYNLEPHSIRPFQLAVAQKLLSHVCSIADSSTQNLDLGSFEKVDFLICIPPSEVTYQQTLLHVWHSGVLLELGLKKEHMTKQRVEQYVLKLDTEAQTKFKAFLQNSFQNPHTLFVLIHDHAHWDLVSSTVHNLYSQSDPSVGLVDRLLNCREVKEAPNIVTLHVTSFPYALQTQHTLISPYNEIHWPASCSNGVDLYHENKKYFGLSEFIESTLSGHSLPLLRYDSSFEAMVTALGKRFPRLHSAVIRTFVLVQHYAAALMAVSGLPQMKNYTSVETLEITQNLLNSPKQCPCGHGLMVLLRVPCSPLAVVAYERLAHVRARLALEEHFEIILGSPSSGVTVGKHFVKQLRMWQKIEDVEWRPQTYLELEGLPCILIFSGMDPHGESLPRSLRYCDLRLINSSCLVRTALEQELGLAAYFVSNEVPLEKGARNEALESDAEKLSSTDNEDEELGTEGSTSEKRSPMKRERSRSHDSASSSLSSKASGSALGGESSAQPTALPQGEHARSPQPRGPAEEGRAPGEKQRPRASQGPPSAISRHSPGPTPQPDCSLRTGQRSVQVSVTSSCSQLSSSSGSSSSSVAPAAGTWVLQASQCSLTKACRQPPIVFLPKLVYDMVVSTDSSGLPKAASLLPSPSVMWASSFRPLLSKTMTSTEQSLYYRQWTVPRPSHMDYGNRAEGRVDGFHPRRLLLSGPPQIGKTGAYLQFLSVLSRMLVRLTEVDVYDEEEININLREESDWHYLQLSDPWPDLELFKKLPFDYIIHDPKYEDASLICSHYQGIKSEDRGMSRKPEDLYVRRQTARMRLSKYAAYNTYHHCEQCHQYMGFHPRYQLYESTLHAFAFSYSMLGEEIQLHFIIPKSKEHHFVFSQPGGQLESMRLPLVTDKSHEYIKSPTFTPTTGRHEHGLFNLYHAMDGASHLHVLVVKEYEMAIYKKYWPNHIMLVLPSIFNSAGVGAAHFLIKELSYHNLELERNRQEELGIKPQDIWPFIVISDDSCVMWNVVDVNSAGERSREFSWSERNVSLKHIMQHIEAAPDIMHYALLGLRKWSSKTRASEVQEPFSRCHVHNFIILNVDLTQNVQYNQNRFLCDDVDFNLRVHSAGLLLCRFNRFSVMKKQIVVGGHRSFHITSKVSDNSAAVVPAQYICAPDSKHTFLAAPAQLLLEKFLQHHSHLFFPLSLKNHDHPVLSVDCYLNLGSQISVCYVSSRPHSLNISCSDLLFSGLLLYLCDSFVGASFLKKFHFLKGATLCVICQDRSSLRQTVVRLELEDEWQFRLRDEFQTANAREDRPLFFLTGRHI"));
    }

    @Test
    void getSequences_multiple() {
        SeqFile seqfile = new SeqFile("data/site_sequences.fasta");
        assertEquals(382, seqfile.getSequences().size());
        assertTrue(seqfile.getSequences().contains("MGNYYAGQLKTTRFEEVLHNSIEASLRSNNLVPRPIFSQLYLEAEQNLAALEGGSRVDNEEEEEEGEGGLETNGPPNPFQLHPLPEGCCTTDGFCQAGKDLRLVSISNEPMDVPAGFLLVGVKSPSLPDHLLVCAVDKRFLPDDNGHNALLGFSGNCVGCGKKGFCYFTEFSNHINLKLTTQPKKQKHLKYYLVRNAQGTLTKGPLICWKGSEFRSRQIPASTCSSSLFPALESTAAFPSEPVPGTNPSILMGAQQAGPASDHPSLNAAMGPAVFNGKDSPKCQQLAKNNLLALPRPSALGILSNSGPPKKRHKGWSPESPSAPDGGCPQGGGNRAKYESAGMSCVPQVGLVGPASVTFPVVASGEPVSVPDNLLKICKAKPVIFKGHGNFPYLCGNLNDVVVSPLLYTCYQNSQSVSRAYEQYGASAIQPISEEMQLLLTVYYLVQLAADQVPLMEDLEQIFLRSWRESHLTEIRQYQQAPPQPFPPAPSAAAPVTSAQLPWLASLAASSCNDSVHVIECAYSLAEGLSEMFRLLVEGKLAKTNYVVIICACRSAAIDSCIAVTGKYQARILSESLLTPAEYQKEVNYELVTGKVDSLGAFFSTLCPEGDIDILLDKFHQENQGHISSSLAASSVTKAASLDVSGTPVCTSYNLEPHSIRPFQLAVAQKLLSHVCSIADSSTQNLDLGSFEKVDFLICIPPSEVTYQQTLLHVWHSGVLLELGLKKEHMTKQRVEQYVLKLDTEAQTKFKAFLQNSFQNPHTLFVLIHDHAHWDLVSSTVHNLYSQSDPSVGLVDRLLNCREVKEAPNIVTLHVTSFPYALQTQHTLISPYNEIHWPASCSNGVDLYHENKKYFGLSEFIESTLSGHSLPLLRYDSSFEAMVTALGKRFPRLHSAVIRTFVLVQHYAAALMAVSGLPQMKNYTSVETLEITQNLLNSPKQCPCGHGLMVLLRVPCSPLAVVAYERLAHVRARLALEEHFEIILGSPSSGVTVGKKFVKQLRMWQKIEDVEWRPQTYLELEGLPCILIFSGMDPHGESLPRSLRYCDLRLINSSCLVRTALEQELGLAAYFVSNEVPLEKGARNEALESDAEKLSSTDNEDEELGTEGSTSEKRSPMKRERSRSHDSASSSLSSKASGSALGGESSAQPTALPQGEHARSPQPRGPAEEGRAPGEKQRPRASQGPPSAISRHSPGPTPQPDCSLRTGQRSVQVSVTSSCSQLSSSSGSSSSSVAPAAGTWVLQASQCSLTKACRQPPIVFLPKLVYDMVVSTDSSGLPKAASLLPSPSVMWASSFRPLLSKTMTSTEQSLYYRQWTVPRPSHMDYGNRAEGRVDGFHPRRLLLSGPPQIGKTGAYLQFLSVLSRMLVRLTEVDVYDEEEININLREESDWHYLQLSDPWPDLELFKKLPFDYIIHDPKYEDASLICSHYQGIKSEDRGMSRKPEDLYVRRQTARMRLSKYAAYNTYHHCEQCHQYMGFHPRYQLYESTLHAFAFSYSMLGEWIQLHFIIPKSKEHHFVFSQPGGQLESMRLPLVTDKSHEYIKSPTFTPTTGRHEHGLFNLYHAMDGASHLHVLVVKEYEMAIYKKYWPNHIMLVLPSIFNSAGVGAAHFLIKELSYHNLELERNRQEELGIKPQDIWPFIVISDDSCVMWNVVDVNSAGERSREFSWSERNVSLKHIMQHIEAAPDIMHYALLGLRKWSSKTRASEVQEPFSRCHVHNFIILNVDLTQNVQYNQNRFLCDDVDFNLRVHSAGLLLCRFNRFSVMKKQIVVGGHRSFHITSKVSDNSAAVVPAQYICAPDSKHTFLAAPAQLLLEKFLQHHSHLFFPLSLKNHDHPVLSVDCYLNLGSQISVCYVSSRPHSLNISCSDLLFSGLLLYLCDSFVGASFLKKFHFLKGATLCVICQDRSSLRQTVVRLELEDEWQFRLRDEFQTANAREDRPLFFLTGRHI"));
        assertTrue(seqfile.getSequences().contains("MGNSYAGQLKTTRFEEVLHNSIEESLRSNNLVPRPIFSQLYLEAEQQLAALEGGSRVDNEEEEEEGEGGLETNGPPNPFQLHPLPEGCCTTDGFCQAGKDLRLVSISNEPMDVPAGFLLVGVKSPSLPDHLLVCAVDKRFLPDDNGHNALLGFSGNCVGCGKKGFCYFTEFSNHINLKLTTQPKKQKHLKYYLVRNAQGTLTKGPLICWKGSEFRSRQIPASTCSSSLFPALESTAAFPSEPVPGTNPSILMGAQQAGPASDHPSLNAAMGPAVFNGKDSPKCQQLAKNNLLALPRPSALGILSNSGPPKKRHKGWSPESPSAPDGGCPQGGGNRAKYESAGMSCVPQVGLVGPASVTFPVVASGEPVSVPDNLLKICKAKPVIFKGHGNFPYLCGNLNDVVVSPLLYTCYQNSQSVSRAYEQYGASAIQPISEEMQLLLTVYYLVQLAADQVPLMEDLEQIFLRSWRESHLTEIRQYQQAPPQPFPPAPSAAAPVTSAQLPWLASLAASSCNDSVHVIECAYSLAEGLSEMFRLLVEGKLAKTNYVVIICACRSAAIDSCIAVTGKYQARILSESLLTPAEYQKEVNYELVTGKVDSLGAFFSTLCPEGDIDILLDKFHQENQGHISSSLAASSVTKAASLDVSGTPVCTSYNLEPHSIRPFQLAVAQKLLSHVCSIADSSTQNLDLGSFEKVDFLICIPPSEVTYQQTLLHVWHSGVLLELGLKKEHMTKQRVEQYVLKLDTEAQTKFKAFLQNSFQNPHTLFVLIHDHAHWDLVFSTVHNLYSQSDPSVGLVDRLLNCREVKEAPNIVTLHVTSFPYALQTQHTLISPYNEIHWPASCSNGVDLYHENKKYFGLSEFIESTLSGHSLPLLRYDSSFEAMVTALGKRFPRLHSAVIRTFVLVQHYAAALMAVSGLPQMKNYTSVETLEITQNLLNSPKQCPCGHGLMVLLRVPCSPLAVVAYERLAHVRARLALEEHFEIILGSPSSGVTVGKHFVKQLRMWQKIEDVEWRPQTYLELEGLPCILIFSGMDPHGESLPRSLRYCDLRLINSSCLVRTALEQELGLAAYFVSNEVPLEKGARNEALESDAEKLSSTDNEDEELGTEGSTSEKRSPMKRERSRSHDSASSSLSSKASGSALGGESSAQPTALPQGEHARSPQPRGPAEEGRAPGEKQRPRASQGPPSAISRHSPGPTPQPDCSLRTGQRSVQVSVTSSCSQLSSSSGSSSSSVAPAAGTWVLQASQCSLTKACRQPPIVFLPKLVYDMVVSTDSSGLPKAASLLPSPSVMWASSFRPLLSKTMTSTEQSLYYRQWTVPRPSHMDYGNRAEGRVDGFHPRRLLLSGPPQIGKTGAYLQFLSVLSRMLVRLTEVDVYDEEEININLREESDWHYLQLSDPWPDLELFKKLPFDYIIHDPKYEDASLICSHYQGIKSEDRGMSRKPEDLYVRRQTARMRLSKYAAYNTYHHCEQCHQYMGFHPRYQLYESTLHAFAFSYSMLGEEIQLHFIIPKSKEHHFVFSQPGGQLESMRLPLVTDKSHEYIKSPTFTPTTGRHEHGLFNLYHAMDGASHLHVLVVKEYEMAIYKKYWPNHIMLVLPSIFNSAGVGAAHFLIKELSYHNLELERNRQEELGIKPQDIWPFIVISDDSCVMWNVVDVNSAGERSREFSWSERNVSLKHIMQHIEAAPDIMHYALLGLRKWSSKTRASEVQEPFSRCHVHNFIILNVDLTQNVQYNQNRFLCDDVDFNLRVHSAGLLLCRFNRFSVMKKQIVVGGHRSFHITSKVSDNSAAVVPAQYICAPDSKHTFLAAPAQLLLEKFLQHHSHLFFPLSLKNHDHPVLSVDCYLNLGSQISVCYVSSRPHSLNISCSDLLFSGLLLYLCDSFVGASFLKKFHFLKGATLCVICQDRSSLRQTVVRLELEDEWQFRLRDEFQTANAREDRPLFFLTGRHI"));
    }

    @Test
    void getFirstSequence_wrongFormat() {
        SeqFile seqfile = new SeqFile("data/GREB1_patterns.csv");
        assertEquals("", seqfile.getFirstSequence());
    }

    @Test
    void getFirstSequence_single() {
        SeqFile seqfile = new SeqFile("data/GREB1_reference.fasta");
        assertEquals("MGNSYAGQLKTTRFEEVLHNSIEASLRSNNLVPRPIFSQLYLEAEQQLAALEGGSRVDNEEEEEEGEGGLETNGPPNPFQLHPLPEGCCTTDGFCQAGKDLRLVSISNEPMDVPAGFLLVGVKSPSLPDHLLVCAVDKRFLPDDNGHNALLGFSGNCVGCGKKGFCYFTEFSNHINLKLTTQPKKQKHLKYYLVRNAQGTLTKGPLICWKGSEFRSRQIPASTCSSSLFPALESTAAFPSEPVPGTNPSILMGAQQAGPASDHPSLNAAMGPAVFNGKDSPKCQQLAKNNLLALPRPSALGILSNSGPPKKRHKGWSPESPSAPDGGCPQGGGNRAKYESAGMSCVPQVGLVGPASVTFPVVASGEPVSVPDNLLKICKAKPVIFKGHGNFPYLCGNLNDVVVSPLLYTCYQNSQSVSRAYEQYGASAIQPISEEMQLLLTVYYLVQLAADQVPLMEDLEQIFLRSWRESHLTEIRQYQQAPPQPFPPAPSAAAPVTSAQLPWLASLAASSCNDSVHVIECAYSLAEGLSEMFRLLVEGKLAKTNYVVIICACRSAAIDSCIAVTGKYQARILSESLLTPAEYQKEVNYELVTGKVDSLGAFFSTLCPEGDIDILLDKFHQENQGHISSSLAASSVTKAASLDVSGTPVCTSYNLEPHSIRPFQLAVAQKLLSHVCSIADSSTQNLDLGSFEKVDFLICIPPSEVTYQQTLLHVWHSGVLLELGLKKEHMTKQRVEQYVLKLDTEAQTKFKAFLQNSFQNPHTLFVLIHDHAHWDLVSSTVHNLYSQSDPSVGLVDRLLNCREVKEAPNIVTLHVTSFPYALQTQHTLISPYNEIHWPASCSNGVDLYHENKKYFGLSEFIESTLSGHSLPLLRYDSSFEAMVTALGKRFPRLHSAVIRTFVLVQHYAAALMAVSGLPQMKNYTSVETLEITQNLLNSPKQCPCGHGLMVLLRVPCSPLAVVAYERLAHVRARLALEEHFEIILGSPSSGVTVGKHFVKQLRMWQKIEDVEWRPQTYLELEGLPCILIFSGMDPHGESLPRSLRYCDLRLINSSCLVRTALEQELGLAAYFVSNEVPLEKGARNEALESDAEKLSSTDNEDEELGTEGSTSEKRSPMKRERSRSHDSASSSLSSKASGSALGGESSAQPTALPQGEHARSPQPRGPAEEGRAPGEKQRPRASQGPPSAISRHSPGPTPQPDCSLRTGQRSVQVSVTSSCSQLSSSSGSSSSSVAPAAGTWVLQASQCSLTKACRQPPIVFLPKLVYDMVVSTDSSGLPKAASLLPSPSVMWASSFRPLLSKTMTSTEQSLYYRQWTVPRPSHMDYGNRAEGRVDGFHPRRLLLSGPPQIGKTGAYLQFLSVLSRMLVRLTEVDVYDEEEININLREESDWHYLQLSDPWPDLELFKKLPFDYIIHDPKYEDASLICSHYQGIKSEDRGMSRKPEDLYVRRQTARMRLSKYAAYNTYHHCEQCHQYMGFHPRYQLYESTLHAFAFSYSMLGEEIQLHFIIPKSKEHHFVFSQPGGQLESMRLPLVTDKSHEYIKSPTFTPTTGRHEHGLFNLYHAMDGASHLHVLVVKEYEMAIYKKYWPNHIMLVLPSIFNSAGVGAAHFLIKELSYHNLELERNRQEELGIKPQDIWPFIVISDDSCVMWNVVDVNSAGERSREFSWSERNVSLKHIMQHIEAAPDIMHYALLGLRKWSSKTRASEVQEPFSRCHVHNFIILNVDLTQNVQYNQNRFLCDDVDFNLRVHSAGLLLCRFNRFSVMKKQIVVGGHRSFHITSKVSDNSAAVVPAQYICAPDSKHTFLAAPAQLLLEKFLQHHSHLFFPLSLKNHDHPVLSVDCYLNLGSQISVCYVSSRPHSLNISCSDLLFSGLLLYLCDSFVGASFLKKFHFLKGATLCVICQDRSSLRQTVVRLELEDEWQFRLRDEFQTANAREDRPLFFLTGRHI", seqfile.getFirstSequence());
    }

    @Test
    void getFirstSequence_multiple() {
        SeqFile seqfile = new SeqFile("data/site_sequences.fasta");
        assertEquals("MGNSYAGQLKTTRFEEVLHNSIEASLRSNNLVPRPIFSQLYLEAEQQLAALEGGSRVDNEEEEEEGEGGLETNGPPNPFQLHPLPEGCCTTDGFCQAGKDLRLVSISNEPMDVPAGFLLVGVKSPSLPDHLLVCAVDKRFLPDDNGHNALLGFSGNCVGCGKKGFCYFTEFSNHINLKLTTQPKKQKHLKYYLVRNAQGTLTKGPLICWKGSEFRSRQIPASTCSSSLFPALESTAAFPSEPVPGTNPSILMGAQQAGPASDHPSLNAAMGPAVFNGKDSPKCQQLAKNNLLALPRPSALGILSNSGPPKKRHKGWSPESPSAPDGGCPQGGGNRAKYESAGMSCVPQVGLVGPASVTFPVVASGEPVSVPDNLLKICKAKPVIFKGHGNFPYLCGNLNDVVVSPLLYTCYQNSQSVSRAYEQYGASAIQPISEEMQLLLTVYYLVQLAADQVPLMEDLEQIFLRSWRESHLTEIRQYQQAPPQPFPPAPSAAAPVTSAQLPWLASLAASSCNDSVHVIECAYSLAEGLSEMFRLLVEGKLAKTNYVVIICACRSAAIDSCIAVTGKYQARILSESLLTPAEYQKEVNYELVTGKVDSLGAFFSTLCPEGDIDILLDKFHQENQGHISSSLAASSVTKAASLDVSGTPVCTSYNLEPHSIRPFQLAVAQKLLSHVCSIADSSTQNLDLGSFEKVDFLICIPPSEVTYQQTLLHVWHSGVLLELGLKKEHMTKQRVEQYVLKLDTEAQTKFKAFLQNSFQNPHTLFVLIHDHAHWDLVSSTVHNLYSQSDPSVGLVDRLLNCREVKEAPNIVTLHVTSFPYALQTQHTLISPYNEIHWPASCSNGVDLYHENKKYFGLSEFIESTLSGHSLPLLRYDSSFEAMVTALGKRFPRLHSAVIRTFVLVQHYAAALMAVSGLPQMKNYTSVETLEITQNLLNSPKQCPCGHGLMVLLRVPCSPLAVVAYERLAHVRARLALEEHFEIILGSPSSGVTVGKHFVKQLRMWQKIEDVEWRPQTYLELEGLPCILIFSGMDPHGESLPRSLRYCDLRLINSSCLVRTALEQELGLAAYFVSNEVPLEKGARNEALESDAEKLSSTDNEDEELGTEGSTSEKRSPMKRERSRSHDSASSSLSSKASGSALGGESSAQPTALPQGEHARSPQPRWPAEEGRAPGEKQRPRASQGPPSAISRHSPGPTPQPDCSLRTGQRSVQVSVTSSCSQLSSSSGSSSSSVAPAAGTWVLQASQCSLTKACRQPPIVFLPKLVYDMVVSTDSSGLPKAASLLPSPSVMWASSFRPLLSKTMTSTEQSLYYRQWTVPRPSHMDYGNRAEGRVDGFHPRRLLLSGPPQIGKTGAYLQFLSVLSRMLVRLTEVDVYDEEEININLREESDWHYLQLSDPWPDLELFKKLPFDYIIHDPKYEDASLICSHYQGIKSEDRGMSRKPEDLYVRRQTARMRLSKYAAYNTYHHCEQCHQYMGFHPRYQLYESTLHAFAFSYSMLGEEIQLHFIIPKSKEHHFVFSQPGGQLESMRLPLVTDKSHEYIKSPTFTPTTGRHEHGLFNLYHAMDGASHLHVLVVKEYEMAIYKKYWPNHIMLVLPSIFNSAGVGAAHFLIKELSYHNLELERNRQEELGIKPQDIWPFIVISDDSCVMWNVVDVNSAGERSREFSWSERNVSLKHIMQHIEAAPDIMHYALLGLRKWSSKTRASEVQEPFSRCHVHNFIILNVDLTQNVQYNQNRFLCDDVDFNLRVHSAGLLLCRFNRFSVMKKQIVVGGHRSFHITSKVSDNSAAVVPAQYICAPDSKHTFLAAPAQLLLEKFLQHHSHLFFPLSLKNHDHPVLSVDCYLNLGSQISVCYVSSRPHSLNISCSDLLFSGLLLYLCDSFVGASFLKKFHFLKGATLCVICQDRSSLRQTVVRLELEDEWQFRLRDEFQTANAREDRPLFFLTGRHI", seqfile.getFirstSequence());
    }
}
