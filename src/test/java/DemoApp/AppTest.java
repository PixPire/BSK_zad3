package DemoApp;

import org.example.Main;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testCodeFrancja(){
        String key="BCADA";
        String textToCode="FRANCJA";
        String codedText="ACFJRAN";
        assert(Main.Code(textToCode,key).equals(codedText));

    }
    @Test
    void testCodeDobrydzien(){
        String key="BCADA";
        String textToCode="DOBRYDZIEN";
        String codedText="BIYNDDOZRE";
        assert(Main.Code(textToCode,key).equals(codedText));

    }
    @Test
    void testCodePolitechnika(){
        String key="BCADA";
        String textToCode="POLITECHNIKA";
        String codedText="LHTIPEKOCAIN";
        assert(Main.Code(textToCode,key).equals(codedText));

    }
    @Test
    void testCodeUniversity(){
        String key="BCADA";
        String textToCode="UNIVERSITY";
        String codedText="IIEYURNSVT";
        assert(Main.Code(textToCode,key).equals(codedText));

    }
    @Ignore
    @Test
    void testDecodeFrancja(){
        String key="BCADA";
        String decodedText="FRANCJA";
        String codedText="ANFCRJA";
        assert(Main.Decode(codedText,key).equals(decodedText));

    }
    @Ignore
    @Test
    void testDecodeDobrydzien(){
        String key="BCADA";
        String decodedText="DOBRYDZIEN";
        String codedText="BRDYOIEDNZ";
        assert(Main.Decode(codedText,key).equals(decodedText));

    }
    @Ignore
    @Test
    void testDecodePolitechnika(){
        String key="BCADA";
        String decodedText="POLITECHNIKA";
        String codedText="LIPTOHNEICKA";
        assert(Main.Decode(codedText,key).equals(decodedText));

    }
    @Ignore
    @Test
    void testDecodeUniversity(){
        String key="BCADA";
        String decodedText="UNIVERSITY";
        String codedText="IVUENITRYS";
        assert(Main.Decode(codedText,key).equals(decodedText));

    }


}