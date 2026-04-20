/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicios.SistemadeVotacao;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author TayQ.
 */
public class SistemadeVotacao {

    // Deixei "Digite 0 para encerrar a votação " pois é apenas para staff ver
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> votos = new ArrayList<>();
        System.out.println("=== SISTEMA DE VOTAÇÃO ===");
        // Digite 0 para encerrar a votação
        //vt = voto

        while (true) {
            System.out.print("Escolha uma das opções:\n 1- para o primeiro candidato\n 2- para o segundo candidato\n 3- para votar branco\n Outro valor- Para votar nulo\n Votar: ");
            int voto = teclado.nextInt();
            if (voto == 0) {
                break;
            }
            votos.add(voto);
        }

        int vtCand1 = 0;
        int vtCand2 = 0;
        int vtBranco = 0;
        int vtNulos = 0;

        for (int voto : votos) {
            switch (voto) {
                case 1 ->
                    vtCand1++;
                case 2 ->
                    vtCand2++;
                case 3 ->
                    vtBranco++;
                default ->
                    vtNulos++;
            }
        }

        int totalVotos = votos.size();

        System.out.println("\n=== RESULTADO DA ELEIÇÃO ===");
        System.out.println("Total de votos:    " + totalVotos);
        System.out.println("Candidato 1:       " + vtCand1);
        System.out.println("Candidato 2:       " + vtCand2);
        System.out.println("Votos em branco:   " + vtBranco);
        System.out.println("Votos nulos:       " + vtNulos);

        teclado.close();
    }
}
