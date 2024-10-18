package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.AddCandidate("Alsobrooks");
        vm.CastVote("Alsobrooks");
        vm.AddCandidate("Hogan");
        vm.CastVote("Hogan");
        vm.CastVote("Hogan");

        System.out.println(vm.toString()); // print out candidates and vote tally for each
    }
}
