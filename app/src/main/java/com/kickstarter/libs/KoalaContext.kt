package com.kickstarter.libs

class KoalaContext {

  /**
   * Determines the place from which the comments dialog was presented.
   *
   * PROJECT_ACTIVITY: The creator's project activity screen.
   * PROJECT_COMMENTS: The comments screen for a project.
   * UPDATE_COMMENTS:  The comments screen for an update.
   */
  enum class CommentDialog(val trackingString: String) {
    PROJECT_ACTIVITY("project_activity"),
    PROJECT_COMMENTS("project_comments"),
    UPDATE_COMMENTS("update_comments")
  }

  /**
   * Determines the place from which the comments were presented.
   *
   * PROJECT: The comments for a project.
   * UPDATE:  The comments for an update.
   */
  enum class Comments(val trackingString: String) {
    PROJECT("project"),
    UPDATE("update")
  }

  /**
   * Determines the place from which the external link was presented.
   *
   * PROJECT_UPDATE:  The project update page.
   * PROJECT_UPDATES: The project updates page.
   */
  enum class ExternalLink(val trackingString: String) {
    PROJECT_UPDATE("project_update"),
    PROJECT_UPDATES("project_updates")
  }

  /**
   * Determines the place from which Messages were presented.
   *
   * BACKER_MODAL:        The backing view, usually seen by pressing "View pledge" on the project page.
   * CREATOR_ACTIVITY:    The creator's activity feed.
   * MESSAGES:            The messages inbox.
   * PROJECT_MESSAGES:    The messages inbox for a particular project of a creator's.
   * PROJECT_PAGE:        The project page.
   */
  enum class Message(val trackingString: String) {
    BACKER_MODAL("backer_modal"),
    CREATOR_ACTIVITY("creator_activity"),
    MESSAGES("messages"),
    PROJECT_MESSAGES("project_messages"),
    PROJECT_PAGE("project_page")
  }

  /**
   * Determines the place from which the Update was presented.
   *
   * UPDATES:           The updates index.
   * ACTIVITY:          The activity feed.
   * ACTIVITY_SAMPLE:   The activity sample.
   */
  enum class Update(val trackingString: String) {
    UPDATES("updates"),
    ACTIVITY("activity"),
    ACTIVITY_SAMPLE("activity_sample")
  }
}
