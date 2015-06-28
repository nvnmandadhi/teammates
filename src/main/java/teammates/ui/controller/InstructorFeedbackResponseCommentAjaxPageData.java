package teammates.ui.controller;

import teammates.common.datatransfer.AccountAttributes;
import teammates.common.datatransfer.FeedbackResponseCommentAttributes;

/*
 * PageData: to be used for {@link FeedbackResponseCommentAttributes} in Ajax operations
 */
public class InstructorFeedbackResponseCommentAjaxPageData extends PageData {

    public FeedbackResponseCommentAttributes comment;
    public String commentId;
    public String commentTime;
    public String showCommentToString;
    public String showGiverNameToString;
    public boolean isError;
    public String errorMessage;
    
    public InstructorFeedbackResponseCommentAjaxPageData(AccountAttributes account) {
        super(account);
    }
}
