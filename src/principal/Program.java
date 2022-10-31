import entities.Produtos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Caminho para criar pasta: ");
        String strPath = sc.nextLine();

        File souceFile = new File(strPath);

        Boolean sucess = new File(strPath + "\\out").mkdir();

        String strFile = strPath + "\\out\\summary.csv";


        System.out.println("Quantos produtos você deseja? ");
        int quant = sc.nextInt();
        

        Produtos[] produtos = new Produtos[quant];
       
        sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
            for (int i = 0; i < quant; i++) 
            {
                String temp[] = new String[3];
                System.out.println("Prod: ");
                
                String prods = sc.nextLine();
                temp = prods.split(",");

                String nome = temp[0];
                double preco = Double.parseDouble(temp[1]);
                int quantidade = Integer.parseInt(temp[2]);

                produtos[i] = new Produtos(nome, preco, quantidade);

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(strFile))) {

                for (int i = 0; i < produtos.length; i++) {
                    bw.write(produtos[i].getNome() + ", " + produtos[i].totalPreco());
                    bw.newLine();
                }

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }


        



    }

}
