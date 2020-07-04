package com.crazy.java004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 五子棋
 */
public class GoBangNew {
    // 定义一个二维数组作为棋盘
    private String[][] board;
    // 定义棋盘的大小
    private static int BOARD_SIZE = 15;

    /**
     * 初始化棋盘
      */
    public void initBoard() {
        // 初始化棋盘数组
        board = new String[BOARD_SIZE][BOARD_SIZE];
        // 把每个元素都赋值为 ➕，用于在控制台画出棋盘
        for (int i=0; i<BOARD_SIZE; i++) {
            for (int j=0; j<BOARD_SIZE; j++) {
                board[i][j] = "➕";
            }
        }
    }

    /**
     * 在控制台输出棋盘的方法
     */
    public void printBoard() {
        // 打印每个数组元素
        for (int i=0; i<BOARD_SIZE; i++) {
            for (int j=0; j<BOARD_SIZE; j++) {
                // 打印数组后、不换行
                System.out.printf(board[i][j]);
            }
            // 每打印完一行，换行
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        GoBangNew goBang = new GoBangNew();
        goBang.initBoard();
        goBang.printBoard();
        // 这是用于获取键盘输入的方法
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
//        bufferedReader.readLine();
        while ((input = bufferedReader.readLine()) != null) {
            // 将用户输入的字符串，用逗号分隔，分割成两个字符串
            String[] posStrArr = input.split(",");
            // 将两个字符串换成用户下棋的坐标
            int xPos = Integer.parseInt(posStrArr[0]);
            int yPos = Integer.parseInt(posStrArr[1]);
            // 把对应的元素赋值为 ⚪
            goBang.board[xPos - 1][yPos - 1] = "⚪";
            /**
             * 电脑随机生成两个整数，作为计算机下棋的坐标，赋值给 board 数组
             * 还涉及
             * 1.坐标的有效性，只能是数字，不能超出棋盘范围。
             * 2.如果下棋的点已经有棋子了，则不能重复下棋。
             * 3.每次下棋后，需要扫描谁赢了。
             */
            goBang.printBoard();
            System.out.println("请输入您的下棋坐标，x,y 格式：（0≤x≤14， 0≤y≤14）");
        }
    }
}
