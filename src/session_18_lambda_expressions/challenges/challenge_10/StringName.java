package session_18_lambda_expressions.challenges.challenge_10;

import java.util.List;

@FunctionalInterface

public interface StringName {
    List<String> firstName(List<String> names);
}