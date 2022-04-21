package br.com.ohanacraft.biotech.dto;

public class InterfaceMachineDTO {
    //template chest
    //0,   1,  2,  3,  4,  5,  6,  7,  8,
    //9,  10, 11, 12, 13, 14, 15, 16, 17,
    //18, 19, 20, 21, 22, 23, 24, 25, 26,
    //27, 28, 29, 30, 31, 32, 33, 34, 35,
    //36, 37, 38, 39, 40, 41, 42, 43, 44,
    //45, 46, 47, 48, 49, 50, 51, 52, 53,

    //techevolution
    public static final int[] TECH_EVOLUTION_BORDER = new int[] {
                         3,  4,  5,  6,  7,  8,
                        12,  13, 14, 15, 16, 17,
                        21,     23, 24, 25, 26,
            27, 28, 29, 30,     32,
            36, 37, 38, 39,     41,
            45, 46, 47, 48, 49, 50
    };
    public static final int[] TECH_EVOLUTION_BORDER_IN = new int[] {
            0,   1,  2,
            9,      11,
            18, 19, 20
    };
    public static final int[] TECH_EVOLUTION_BORDER_OUT = new int[] {
            33, 34, 35,
            42,     44,
            51, 52, 53
    };
    public static final int[] TECH_EVOLUTION_PROGRESS_BAR_SLOT = new int[] {
            22,
            31,
            40
    };
    public static final int[] TECH_EVOLUTION_INPUT_SLOTS = new int[] {
            10
    };
    public static final int[] TECH_EVOLUTION_OUTPUT_SLOTS = new int[] {
            43
    };

    //techgerator
    public static final int[] TECH_GENERATOR_BORDER = new int[] {



            27, 28, 29, 30,
            36,     38, 39,
            45, 46, 47, 48
    };
    public static final int[] TECH_GENERATOR_BORDER_IN = new int[] {
            0,   1,  2,  3,  4,  5,  6,  7,  8,
            9,       11, 12,                17,
            18, 19, 20, 21, 22, 23, 24, 25, 26
    };
    public static final int[] TECH_GENERATOR_BORDER_OUT = new int[] {
            31, 32, 33, 34, 35,
            40,             44,
            49,             53
    };
    public static final int[] TECH_GENERATOR_PROGRESS_BAR_SLOT = new int[] {
            37
    };
    public static final int[] TECH_GENERATOR_INPUT_SLOTS = new int[] {
            10,13, 14, 15, 16

    };
    public static final int[] TECH_GENERATOR_OUTPUT_SLOTS = new int[] {
            41, 42, 43,
            50, 51, 52
    };

    //techmutation
    public static final int[] TECH_MUTATION_BORDER = new int[] {
            0,                               8,
            9,                              17,
            18,                             26,
            27, 28, 29,  33, 34, 35,
            36, 37, 38,  42, 43, 44,
            45, 46, 47,  51, 52, 53
    };

    public static final int[] TECH_MUTATION_BORDER_IN = new int[] {
            1,  2,  3,      5,  6,  7,
            10,     12,     14,     16,
            19, 20, 21,     23, 24, 25
    };
    public static final int[] TECH_MUTATION_BORDER_OUT = new int[] {
            30, 31, 32,
            39,     41,
            48, 49, 50

    };
    public static final int[] TECH_MUTATION_PROGRESS_BAR_SLOT = new int[] {
            4,
            13,
            22
    };
    public static final int[] TECH_MUTATION_INPUT_SLOTS = new int[] {
            11,15
    };
    public static final int[] TECH_MUTATION_OUTPUT_SLOTS = new int[] {
            40
    };
}
