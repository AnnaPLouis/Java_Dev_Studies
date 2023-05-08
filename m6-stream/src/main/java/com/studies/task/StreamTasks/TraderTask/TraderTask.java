package com.studies.task.StreamTasks.TraderTask;

import java.util.*;

import java.util.stream.Stream;

public class TraderTask {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions =
                Arrays.asList(
                        new Transaction(brian,2011,300),
                        new Transaction(raoul,2012,1000),
                        new Transaction(raoul,2011,400),
                        new Transaction(mario,2012,710),
                        new Transaction(mario,2012,700),
                        new Transaction(alan,2012,950));


        //Find all transactions in the year 2011 and sort them by value(small to high)

        transactions.stream().filter(p-> p.getYear()==2011)
                .map(Transaction::getValue)
                .sorted()
                .forEach(System.out::println);

        //What are all the unique cities where the traders work?

        transactions.stream().map(p->p.getTrader()
                .getCity())
                .distinct()
                .forEach(System.out::println);

        //Find all traders from Cambridge and sort them by name.

        transactions.stream().filter(p->p.getTrader().getCity().equals("Cambridge"))
                .map(p->p.getTrader().getName())
                .distinct()
                .sorted().forEach(System.out::println);

        //Return a string of all traders’ names sorted alphabetically.

        transactions.stream().map(p->p.getTrader().getName())
                .sorted()
                .distinct()
                .forEach(System.out::println);

        //Are any traders based in Milan?

        boolean basedInMilan = transactions.stream()
                .anyMatch(p->p.getTrader().getCity().equals("Milan"));

        System.out.println(basedInMilan);


        //Print the values of all transactions from the traders living in Cambridge.

        transactions.stream().filter(p->p.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //What is the highest value of all the transactions?

        Optional<Integer> maxTransaction =
                transactions.stream().map(p->p.getValue()).reduce(Integer::max);

        System.out.println(maxTransaction.get());


        //Find the transaction with the smallest value.

        Optional<Integer> minTransaction =
                transactions.stream().map(p->p.getValue()).reduce(Integer::min);

        System.out.println(minTransaction.get());
    }
}
