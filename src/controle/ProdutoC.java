/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ProdutoD;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Produto;

/**
 *
 * @author Simone Barbosa
 * @author Jéssica Alves
 */
public class ProdutoC {
     public void cadastrar (ArrayList<String> produto){
         
         Produto p = new Produto();
         p.setNome(produto.get(0));
         p.setModelo(produto.get(1));
         p.setMarca(produto.get(2));
         p.setQuantidade(Integer.parseInt(produto.get(3)));
         p.setConfiguracao(produto.get(4));
         p.setValor(Double.parseDouble(produto.get(5)));
         
         
         new ProdutoD().cadastrar(p);

       
     System.out.println(produto.get(0));
        
        for (String string : produto) {
       System.out.println(string);
      }
         
         
         
        
    }
    public void excluir (){
        
    }
    public void alterar (){
        
    }
    public void salvar(){
        
    }
    public void pesquisar(){
        
    }
}

    

