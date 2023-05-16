package buscabinaria;

public class BuscaBinaria {
public static void main(String[] args) {

    int[] v = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,-200};
    
    System.out.println(buscaBinaria(v, -20));
    
}
static boolean buscaBinaria(int v[],int valor){
    return buscaBinaria(v, valor,(v.length)/2,v.length,0);
}

private static boolean buscaBinaria(int v[],int valor,int i,int limSup,int limInf){

    if(v[i] == valor){
        return true;
    }
    if(limSup-limInf <= 1){
        return false;
    }
    if(v[i] < valor){
        return buscaBinaria(v, valor,((limSup+i)/2), limSup, i);
    }
    
    if(limInf != 0){
        return buscaBinaria(v,valor,i-((i-limInf)/2), i, limInf);
        }
    return buscaBinaria(v,valor,((i-limInf)/2), i, limInf);
    
   
    
}
    
}
