package org.iplantc.de.theme.base.client.teams;

import com.google.gwt.i18n.client.Messages;

/**
 * The interface for all the textual strings used in the Teams view
 * @author aramsey
 */
public interface TeamsDisplayStrings extends Messages {
    String teamsMenu();

    String createNewTeam();

    String manageTeam();

    String leaveTeam();

    String teamInfoBtnToolTip();

    String teamNameLabel();

    String teamDescLabel();

    String detailsHeading(String subjectDisplayName);

    String membersLabel();

    String detailsGridEmptyText();
}