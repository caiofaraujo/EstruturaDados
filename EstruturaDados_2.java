package EstruturaDados_2;

/**
 *
 * @author caio.faraujo
 */
public class Exercicio_01 {
    public static void main(String[] args) {
        int vetor [] = {0, 9, 0};
        insereInteiro(9, 0, vetor);
        
        // INSERINDO VETOR
        System.out.println("Inserindo vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("V[" + i + "]: " + vetor[i]);
        }       
        
        // REMOVENDO VETOR
        System.out.println("Removendo vetor: ");
        int vetor2 [] = new int [vetor.length-1];
        vetor = removeInteiro(9, vetor);
        
        for (int j = 0; j < vetor.length; j++) {
            System.out.println("V[" + j + "]: " + vetor[j]);
        }      
        
    }
    
    
    public static void insereInteiro (int n, int p, int v[]) {
        v[p] = n;
    }
    
    public static int[] removeInteiro (int n, int v[]) {
        int vAux[] = new int [v.length-1];
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] != n) {                
                vAux[i] = v[i+1];
            } else {
                i++;
            }
        }
        return vAux;
    }
}
