package com.inflearn.DFSBFS.경로탐색DFS;

import java.util.Scanner;

public class Main {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        check = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        check[1] = 1;
        System.out.println(answer);
    }

    public int solution(int v) {
        if (v == n) {
            answer++;
        }
        else
        {
            // 정점
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    solution(i);
                    check[i] = 0;
                }
            }
        }
        return answer;
    }
}
