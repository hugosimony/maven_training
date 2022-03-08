package fr.lernejo;

import org.junit.jupiter.api.Assertions;

class SampleTest {

    @org.junit.jupiter.api.Test
    void op() {
        Sample test = new Sample();
        Assertions.assertEquals(test.op(Sample.Operation.ADD, 1, 1), 2);
        Assertions.assertEquals(test.op(Sample.Operation.ADD, -3, 3), 0);
        Assertions.assertEquals(test.op(Sample.Operation.ADD, 42, 0), 42);
        Assertions.assertEquals(test.op(Sample.Operation.ADD, -2, -3), -5);
        Assertions.assertEquals(test.op(Sample.Operation.ADD, 0, 0), 0);

        Assertions.assertEquals(test.op(Sample.Operation.MULT, 1, 3), 3);
        Assertions.assertEquals(test.op(Sample.Operation.MULT, -3, 4), -12);
        Assertions.assertEquals(test.op(Sample.Operation.MULT, 42, 0), 0);
        Assertions.assertEquals(test.op(Sample.Operation.MULT, -4, -4), 16);
        Assertions.assertEquals(test.op(Sample.Operation.MULT, 0, 0), 0);
    }

    @org.junit.jupiter.api.Test
    void fact() {
        Sample test = new Sample();

        Assertions.assertEquals(test.fact(5), 120);
        Assertions.assertEquals(test.fact(15), 2004310016);
        Assertions.assertEquals(test.fact(1), 1);
        Assertions.assertEquals(test.fact(0), 1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> test.fact(-3));
    }
}
