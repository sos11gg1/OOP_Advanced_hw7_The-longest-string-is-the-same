package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J�@�r��(<100)");
        String inputstring = scanner.next();
        String LongestStandard = "";
        int LongestLength = 0;
        System.out.println(inputstring);
        System.out.println(inputstring.substring(1, 3));
        int InputstringLength = inputstring.length();

        for (int i = 0; i < InputstringLength; ) {
            for (int j = 2; j < InputstringLength + 1; ) {                      //(�Y�ѫ᩹�e��o�ȵ��P�_�l�ȡA�i���S���@�ӬۦP)
                if (inputstring.lastIndexOf(inputstring.substring(i, j)) == i) {//�᭱�S���ۦP��
                    i++;                                                //���U��
                    j = i + 2;                                          //�ǭǥ���
                    if (j >= InputstringLength + 1) {
                        i = InputstringLength;                          //�r�ꦬ�M���������j�������j��
                    }
                } else {
                    int LN = inputstring.substring(i, j).length();
                    if (LN > LongestLength) {                           //�p�G���ۦP���ת��r��j��"�̪��r�����"
                        LongestStandard = inputstring.substring(i, j);  //�N�r���л\��зǦr��
                        LongestLength = LN;                             //�N"�̪��r�����"��J�Ӫ���
                    } else if (LN == LongestLength) {                   //�Y�����׬ۦP
                        LongestStandard = LongestStandard + "," +       //�i��r��W��
                                inputstring.substring(i, j);
                    }
                    j++;
                }
            }
        }
        System.out.println("�̱`���Ʀr��:" + LongestStandard);

    }

}
