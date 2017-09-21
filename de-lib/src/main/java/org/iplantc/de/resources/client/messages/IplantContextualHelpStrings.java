package org.iplantc.de.resources.client.messages;

/**
 * Interface to represent the messages contained in resource bundle:
 * 
 */
public interface IplantContextualHelpStrings extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "<p>The Collaborators window allows you to quickly find, add, and remove CyVerse users within your Collaborators list.</p><br/><p>Adding someone as your collaborator enhances the sharing feature, making it even easier to share data with one, a few, or all of your collaborators.</p><br/><p>To add a collaborator, begin typing their name or CyVerse username in the search field and a results drop-down will appear. Select your desired name to add them to your list of collaborators. You can also easily access this list when sharing.</p>".
   * 
   * @return translated "<p>The Collaborators window allows you to quickly find, add, and remove CyVerse users within your Collaborators list.</p><br/><p>Adding someone as your collaborator enhances the sharing feature, making it even easier to share data with one, a few, or all of your collaborators.</p><br/><p>To add a collaborator, begin typing their name or CyVerse username in the search field and a results drop-down will appear. Select your desired name to add them to your list of collaborators. You can also easily access this list when sharing.</p>"
   */
  @DefaultMessage("<p>The Collaboration window allows you different ways to quickly find, add, and remove CyVerse users within your set of Collaborators.</p>"
                  + "<p>Adding someone as your collaborator enhances the sharing feature, making it even easier to share data with one, a few, or all of your collaborators.</p>"
                  + "<br><p><u>Collaborators</u></p>"
                  + "<p>Using the Collaborators tab allows you to organize your own private set and lists of collaborators.</p>"
                  + "<p>To add a collaborator, begin typing their name or CyVerse username in the search field and a results drop-down will appear. Select your desired name to add them to your set of collaborators. You can also easily access this set when sharing.</p>"
                  + "<p>Additionally, if you have the need to frequently share data with several of the same collaborators, you can create a Collaborator List.  Click the \"Add List\" button to start creating your own custom lists of Collaborators.</p>"
                  + "<br><p><u>Teams</u></p>"
                  + "<p>Using the Teams tab allows you to create, organize, and join public or private groups of collaborators.</p>"
                  + "<p>Any teams you are a member of will show up under \"My Teams\".  You can find other public teams that you can join by selecting \"All Teams\".</p>"
                  + "<p>You can also create your own team, defining your own team members and team privileges, by selecting \"Create Team\".</p>")
  @Key("collaboratorsHelp")
  String collaboratorsHelp();

  /**
   * Translated "Your requested tool is now available in the Discovery Environment. Please see the Status Comments for more information.".
   * 
   * @return translated "Your requested tool is now available in the Discovery Environment. Please see the Status Comments for more information."
   */
  @DefaultMessage("Your requested tool is now available in the Discovery Environment. Please see the Status Comments for more information.")
  @Key("toolRequestStatusCompleteHelp")
  String toolRequestStatusCompleteHelp();

  /**
   * Translated "Your tool request is currently being evaluated. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.".
   * 
   * @return translated "Your tool request is currently being evaluated. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
   */
  @DefaultMessage("Your tool request is currently being evaluated. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.")
  @Key("toolRequestStatusEvaluationHelp")
  String toolRequestStatusEvaluationHelp();

  /**
   * Translated "The installation of your requested tool was unsuccessful. Please see the Status Comments for more information.".
   * 
   * @return translated "The installation of your requested tool was unsuccessful. Please see the Status Comments for more information."
   */
  @DefaultMessage("The installation of your requested tool was unsuccessful. Please see the Status Comments for more information.")
  @Key("toolRequestStatusFailedHelp")
  String toolRequestStatusFailedHelp();

  /**
   * Translated "Your Tool Request will be in one of the following Statuses.".
   * 
   * @return translated "Your Tool Request will be in one of the following Statuses."
   */
  @DefaultMessage("Your Tool Request will be in one of the following Statuses.")
  @Key("toolRequestStatusHelp")
  String toolRequestStatusHelp();

  /**
   * Translated "The CyVerse team is currently installing your requested tool. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.".
   * 
   * @return translated "The CyVerse team is currently installing your requested tool. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
   */
  @DefaultMessage("The CyVerse team is currently installing your requested tool. You will receive updates in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.")
  @Key("toolRequestStatusInstallationHelp")
  String toolRequestStatusInstallationHelp();

  /**
   * Translated "The CyVerse team is waiting for more information regarding your tool request. Please see the Status Comments for more information.".
   * 
   * @return translated "The CyVerse team is waiting for more information regarding your tool request. Please see the Status Comments for more information."
   */
  @DefaultMessage("The CyVerse team is waiting for more information regarding your tool request. Please see the Status Comments for more information.")
  @Key("toolRequestStatusPendingHelp")
  String toolRequestStatusPendingHelp();

  /**
   * Translated "Your tool request has been submitted. You will receive updates in the Discovery Environment as the evaluation and installation process proceeds.".
   * 
   * @return translated "Your tool request has been submitted. You will receive updates in the Discovery Environment as the evaluation and installation process proceeds."
   */
  @DefaultMessage("Your tool request has been submitted. You will receive updates in the Discovery Environment as the evaluation and installation process proceeds.")
  @Key("toolRequestStatusSubmittedHelp")
  String toolRequestStatusSubmittedHelp();

  /**
   * Translated "The CyVerse team is currently validating your requested tool. You will receive notifications in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.".
   * 
   * @return translated "The CyVerse team is currently validating your requested tool. You will receive notifications in the Discovery Environment as the process proceeds. Please see the Status Comments for more information."
   */
  @DefaultMessage("The CyVerse team is currently validating your requested tool. You will receive notifications in the Discovery Environment as the process proceeds. Please see the Status Comments for more information.")
  @Key("toolRequestStatusValidationHelp")
  String toolRequestStatusValidationHelp();

  @DefaultMessage("A custom status can sometimes be applicable. Please see the Status Comments for more information.")
  @Key("toolRequestStatusOtherHelp")
  String toolRequestStatusOtherHelp();
}
