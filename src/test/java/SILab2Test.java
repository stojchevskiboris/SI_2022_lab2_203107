import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void EveryStatementMethodC0() {
        List<String> testList = new ArrayList<String>();
        testList.add("0"); //    0 0 0
        testList.add("0"); //    # 0 #
        testList.add("0"); //    0 0 #
        testList.add("#");
        testList.add("0");
        testList.add("#");
        testList.add("0");
        testList.add("0");
        testList.add("#");

        List<String> reftList = new ArrayList<String>();
        reftList.add("1"); //    0 0 0
        reftList.add("0"); //    # 0 #
        reftList.add("1"); //    0 0 #
        reftList.add("#");
        reftList.add("2"); //    1 0 1
        reftList.add("#"); //    # 2 #
        reftList.add("1"); //    1 1 #
        reftList.add("1");
        reftList.add("#");

        assertEquals(
                reftList,
                SILab2.function(testList)
        );

    }


    @Test
    void EveryBranchMethodC1() {
        List<String> testList2 = new ArrayList<String>();
        testList2.add("#"); //    # 0 #
        testList2.add("0"); //    # 0 0
        testList2.add("#"); //    0 # 0
        testList2.add("#");
        testList2.add("0");
        testList2.add("0");
        testList2.add("0");
        testList2.add("#");
        testList2.add("0");

        List<String> reftList2 = new ArrayList<String>();
        reftList2.add("#"); //    # 0 #
        reftList2.add("2"); //    # 0 0
        reftList2.add("#"); //    0 # 0
        reftList2.add("#");
        reftList2.add("2"); //    # 2 #
        reftList2.add("1"); //    # 2 1
        reftList2.add("2"); //    2 # 1
        reftList2.add("#");
        reftList2.add("1");

        assertEquals(
                reftList2,
                SILab2.function(testList2)
        );
    }

    @Test
    void TestExCase() {
        List<String> testList2 = new ArrayList<String>();
        testList2.add("#"); //    # 0
        testList2.add("0"); //    # #
        testList2.add("#"); //    0
        testList2.add("#");
        testList2.add("0");


        List<String> reftList2 = new ArrayList<String>();
        reftList2.add("#"); //    # 2
        reftList2.add("2"); //    # #
        reftList2.add("#"); //    1
        reftList2.add("#");
        reftList2.add("1");


        assertEquals(
                reftList2,
                SILab2.function(testList2)
        );
    }

    @Test
    void TestEx2Case() {
        List<String> testList2 = new ArrayList<String>();
        List<String> reftList2 = new ArrayList<String>();
        IllegalArgumentException IlArEx = new IllegalArgumentException((Throwable) SILab2.function(reftList2));

        assertEquals(
                IlArEx,
                SILab2.function(testList2)
        );
    }

}