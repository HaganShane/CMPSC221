package edu.psu.cmpsc221;

public class Example {
    public static void main(String[] args) {
        Example example = new Example();
        example.executeFunction(new ComputeSuccessor(), 45);
        example.executeFunction(new ComputeSuccessor(), 2);
        example.executeFunction(new ComputeLength(), "Babe");
        example.executeFunction(new ComputeLength(), "Ripple");
        example.executeFunction(new ComputeDouble(), 45);
        example.executeFunction(new ComputeDouble(), 2);
    }

    private <R,D> void executeFunction(edu.psu.cmpsc221.Function<R,D> function, D value) {
        System.out.println(function.apply(value));
    }

    private static class ComputeDouble implements edu.psu.cmpsc221.Function<Integer, Integer> {
        @Override
        public Integer apply(Integer parameter) {
            return parameter * 2;
        }
    }

    private static class ComputeSuccessor
            implements edu.psu.cmpsc221.Function<Integer, Integer> {
        @Override
        public Integer apply(Integer parameter) {
            return parameter + 1;
        }
    }

    private static class ComputeLength implements edu.psu.cmpsc221.Function<Integer, String> {
        @Override
        public Integer apply(String parameter) {
            return parameter.length();
        }
    }
}

