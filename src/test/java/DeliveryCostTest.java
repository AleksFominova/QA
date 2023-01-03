import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class DeliveryCostTest {

    @Test
    void deliveryCostCalc() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(550,deliveryCost.deliveryCostCalc(2,true, true, "очень высокая"));

    }
    @Test
    void deliveryCostCalc2() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(150,deliveryCost.deliveryCostCalc(2,false, false, "высокая"));

    }
    @Test
    void deliveryCostCal3() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(550,deliveryCost.deliveryCostCalc(2,true, true, "повышенная"));

    }

    @Test
    void deliveryCostCalc4() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(150,deliveryCost.deliveryCostCalc(2,false, false, "обычная"));

    }

    @Test
    void deliveryCostCalc5() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(500,deliveryCost.deliveryCostCalc(10,false, true, "обычная"));

    }

    @Test
    void deliveryCostCalc6() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(300,deliveryCost.deliveryCostCalc(10,true, false, "очень высокая"));

    }

    @Test
    void deliveryCostCal7() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(500,deliveryCost.deliveryCostCalc(10,false, true, "высокая"));

    }
    @Test
    void deliveryCostCalc8() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(300,deliveryCost.deliveryCostCalc(10,true, false, "повышенная"));

    }
    @Test
    void deliveryCostCalc9() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(700,deliveryCost.deliveryCostCalc(30,true, true, "повышенная"));

    }

    @Test
    void deliveryCostCalc10() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(300,deliveryCost.deliveryCostCalc(30,false, false, "обычная"));

    }

    @Test
    void deliveryCostCalc11() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(700,deliveryCost.deliveryCostCalc(30,true, true, "очень высокая"));

    }

    @Test
    void deliveryCostCalc12() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(300,deliveryCost.deliveryCostCalc(30,false, false, "высокая"));

    }

    @Test
    void deliveryCostCalc13() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(700,deliveryCost.deliveryCostCalc(31,false, true, "высокая"));

    }
    @Test
    void deliveryCostCalc14() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(500,deliveryCost.deliveryCostCalc(31,true, false, "повышенная"));

    }
    @Test
    void deliveryCostCalc15() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(700,deliveryCost.deliveryCostCalc(31,false, true, "обычная"));

    }
    @Test
    void deliveryCostCalc16() {
        DeliveryCost deliveryCost = new DeliveryCost();
        assertEquals(500,deliveryCost.deliveryCostCalc(31,true, false, "очень высокая"));


    }





















}


