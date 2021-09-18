/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilh
 */
public class TDD {
    boolean datas(int ano) {
        if(ano >= 1900 && ano <= 2020) {
            return true;
        }
        return false;
    }
    
    boolean notaBimestral(float nota) {
        if(nota >= 0 && nota <= 10) {
            return true;
        }
        return false;
    }
    
    int periodicidadeDeRenovacao(int idade) {
        if(idade < 50) {
            return 10;
        } else if (idade >= 50 && idade < 70) {
            return 5;
        } 
        return 3;
    }
}
