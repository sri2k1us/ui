package org.iplantc.de.teams.client;

import org.iplantc.de.client.models.IsMaskable;
import org.iplantc.de.client.models.groups.Group;
import org.iplantc.de.teams.client.events.TeamFilterSelectionChanged;
import org.iplantc.de.teams.client.events.TeamInfoButtonSelected;
import org.iplantc.de.teams.client.models.TeamsFilter;

import com.google.gwt.user.client.ui.IsWidget;

import java.util.List;

/**
 * An interface for the UI's Team view in the Collaboration window
 */
public interface TeamsView extends IsWidget,
                                   IsMaskable,
                                   TeamInfoButtonSelected.HasTeamInfoButtonSelectedHandlers,
                                   TeamFilterSelectionChanged.HasTeamFilterSelectionChangedHandlers {

    /**
     * An appearance class for all string related items in the Teams view
     */
    interface TeamsViewAppearance {

        String teamsMenu();

        String createNewTeam();

        String manageTeam();

        String leaveTeam();

        int nameColumnWidth();

        String nameColumnLabel();

        int descColumnWidth();

        String descColumnLabel();

        int infoColWidth();

        String loadingMask();

        String teamNameLabel();

        String teamDescLabel();

        int teamDetailsWidth();

        int teamDetailsHeight();

        String detailsHeading(Group group);

        String membersLabel();

        String detailsGridEmptyText();
    }

    /**
     * This presenter is responsible for managing all the events from the TeamsView
     */
    interface Presenter {

        /**
         * Initialize the Team presenter to begin fetching teams
         */
        void go();
    }

    /**
     * Add the specified groups to the Teams view
     * @param result
     */
    void addTeams(List<Group> result);

    /**
     * Remove any teams from the ListStore
     */
    void clearTeams();

    /**
     * Return the filter currently set in the Team view
     * @return
     */
    TeamsFilter getCurrentFilter();
}