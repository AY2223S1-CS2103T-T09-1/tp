package seedu.watson.logic.parser;

import static seedu.watson.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.watson.logic.parser.CliSyntax.PREFIX_STUDENTCLASS;
import static seedu.watson.logic.parser.CliSyntax.PREFIX_SUBJECT;

import java.util.Arrays;

import java.util.List;
import seedu.watson.logic.commands.FindCommand;
import seedu.watson.logic.commands.FindNameCommand;
import seedu.watson.logic.parser.exceptions.ParseException;
import seedu.watson.model.person.FindCommandPredicate;
import seedu.watson.model.person.Name;
import seedu.watson.model.person.StudentClass;
import seedu.watson.model.person.subject.Subject;
import seedu.watson.commons.core.Messages;

/**
 * Parses input arguments and creates a new FindCommand object
 */
public class FindCommandParser implements Parser<FindCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the FindCommand
     * and returns a FindCommand object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public FindCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                String.format(Messages.MESSAGE_INVALID_COMMAND_FORMAT, FindCommand.MESSAGE_USAGE));
        }

        return new FindCommand(new FindCommandPredicate(List.of(trimmedArgs.split(" "))));
    }
}
