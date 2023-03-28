import java.util.*;

public class ExemplosList {
    public static void main(String[] args) {

   /*   List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        System.out.println(notas);
        notas.add(10d);
        System.out.println(notas);

        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        System.out.println(notas);
        notas.add(1D);
        System.out.println(notas);

        // não é permitido adicionar ou remover itens da coleção quando utilizamos os metodos:
            Arrays.asList();
            List.of();
      */
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
       System.out.println(notas); /*

        System.out.println("Exiba a posição da nota 5.0 : " + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5.0 ), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta presente na lista ");
        System.out.println(notas.contains(5.0));

        notas.remove(5);
        System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));

       System.out.println("Exiba a menor nota: " + Collections.min(notas));
       System.out.println("Imprimir os itens da lista na ordem que forma informados");
       for(Double nota: notas) System.out.println(nota);

       System.out.println("Exiba a maior nota: "+ Collections.max(notas));
       System.out.println(notas);


        Double sum = 0.0;
        for(Double nota : notas){
            sum += nota;
        }
        System.out.println("Exiba a soma dos valores: " + notas +" é: " + sum);

        System.out.println("exiba a soma usando iterator(): " );
        Iterator<Double> iterator = notas.iterator();
        Double sum = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);


        System.out.println("Exiba a média de notas: ");
        Double sum = 0d;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.printf("Média = %.1f ",sum/notas.size());

        System.out.println(notas);
        System.out.println("remova todas as notas menores que sete:");
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            if (next < 7.0){
                iterator.remove();
            }
        }
        System.out.println(notas);

       */
        notas.clear();
        System.out.println(notas);


    }
}