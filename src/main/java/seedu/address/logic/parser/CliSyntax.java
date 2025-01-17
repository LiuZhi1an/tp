package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("/n");
    public static final Prefix PREFIX_PHONE = new Prefix("/p");
    public static final Prefix PREFIX_EMAIL = new Prefix("/e");
    public static final Prefix PREFIX_ADDRESS = new Prefix("/a");
    public static final Prefix PREFIX_POSITION = new Prefix("/t");
    public static final Prefix PREFIX_MEMBER_ID = new Prefix("/m");
    public static final Prefix PREFIX_DATE = new Prefix("/d");
    public static final Prefix PREFIX_EVENT = new Prefix("/v");
    public static final Prefix PREFIX_TASK_ID = new Prefix("/t");
    public static final Prefix PREFIX_MEMBER_ID_DEL = new Prefix("/for");
}
