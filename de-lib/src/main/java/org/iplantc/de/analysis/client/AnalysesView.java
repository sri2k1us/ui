package org.iplantc.de.analysis.client;


import org.iplantc.de.client.models.AppTypeFilter;
import org.iplantc.de.client.models.analysis.Analysis;
import org.iplantc.de.client.models.analysis.AnalysisPermissionFilter;
import org.iplantc.de.client.services.callbacks.ReactErrorCallback;
import org.iplantc.de.client.services.callbacks.ReactSuccessCallback;
import org.iplantc.de.theme.base.client.analyses.AnalysesViewDefaultAppearance.AnalysisInfoStyle;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.HasOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.autobean.shared.Splittable;

import java.util.List;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

/**
 * @author sriram, jstroot
 */
@JsType
public interface AnalysesView extends IsWidget {
    interface Appearance {

        String appName();

        String endDate();

        String gridEmptyText();

        String name();

        String noParameters();

        String pagingToolbarStyle();

        String paramName();

        String paramType();

        String paramValue();

        String retrieveParametersLoadingMask();

        String searchFieldEmptyText();

        String selectionCount(int count);

        String startDate();

        String status();

        String goToOutputFolder();

        ImageResource folderIcon();

        String viewParamLbl();

        ImageResource fileViewIcon();

        String relaunchAnalysis();

        ImageResource runIcon();

        String cancelAnalysis();

        String completeAndSaveAnalysis();

        ImageResource deleteIcon();

        String delete();

        ImageResource completeIcon();

        ImageResource cancelIcon();

        String analysesMenuLbl();

        String editMenuLbl();

        String renameMenuItem();

        ImageResource fileRenameIcon();

        String updateComments();

        ImageResource userCommentIcon();

        String refresh();

        ImageResource refreshIcon();

        String showAll();

        ImageResource arrow_undoIcon();

        ImageResource saveIcon();

        String saveAs();

        String viewAnalysisStepInfo();

        String stepType();

        String jobId();

        AnalysisInfoStyle css();

        ImageResource shareIcon();

        String share();

        String shareCollab();

        String shareSupport();

        String shareSupportConfirm();

        String shareWithInput();

        String shareOutputOnly();

        String stepInfoDialogHeader();

        String stepInfoDialogWidth();

        String stepInfoDialogHeight();

        int dotMenuWidth();

        String windowWidth();

        String windowHeight();

        int windowMinWidth();

        int windowMinHeight();

        int liveGridRowHeight();
    }

    @JsType
    interface Presenter {

        interface Appearance {

            String analysesRetrievalFailure();

            SafeHtml analysisCommentUpdateFailed();

            SafeHtml analysisCommentUpdateSuccess();

            SafeHtml analysisRenameFailed();

            SafeHtml analysisRenameSuccess();

            String analysisStopSuccess(String name);

            String comments();

            String deleteAnalysisError();

            String stopAnalysisError(String name);

            String analysisStepInfoError();

            String userRequestingHelpSubject();

            String requestProcessing();

            String commentsDialogWidth();

            String commentsDialogHeight();

            String warning();

            String analysesExecDeleteWarning();

            String rename();

            String renameAnalysis();

            String supportRequestFailed();

            String supportRequestSuccess();
        }

        @JsIgnore
        List<Analysis> getSelectedAnalyses();

        @JsIgnore
        void go(final HasOneWidget container,
                String baseDebugId,
                final List<Analysis> selectedAnalyses);

        @JsIgnore
        void setSelectedAnalyses(List<Analysis> selectedAnalyses);

        void setViewDebugId(String baseId);

        @JsIgnore
        AnalysisPermissionFilter getCurrentPermFilter();

        @JsIgnore
        AppTypeFilter getCurrentTypeFilter();

        @JsIgnore
        void setFilterInView(AnalysisPermissionFilter permFilter, AppTypeFilter typeFilter);

        void getAnalyses(int limit,
                         int offset,
                         Splittable filters,
                         String sortField,
                         String sortDir,
                         ReactSuccessCallback callback,
                         ReactErrorCallback errorCallback);

        void renameAnalysis(String analysisId,
                            String newName,
                            ReactSuccessCallback callback,
                            ReactErrorCallback errorCallback);

        void updateAnalysisComments(String id,
                                    String comment,
                                    ReactSuccessCallback callback,
                                    ReactErrorCallback errorCallback);

        void onAnalysisNameSelected(String resultFolderId);

        void onAnalysisAppSelected(String analysisId, String systemId, String appId);

        void onCancelAnalysisSelected(String analysisId,
                                      String analysisName,
                                      ReactSuccessCallback callback,
                                      ReactErrorCallback errorCallback);

        void onShareAnalysisSelected(Splittable[] analysisList);

        void deleteAnalyses(String[] analysesToDelete,
                            ReactSuccessCallback callback,
                            ReactErrorCallback errorCallback);

        void onUserSupportRequested(Splittable analysis,
                                    String comment,
                                    ReactSuccessCallback callback,
                                    ReactErrorCallback errorCallback);

        void onAnalysisJobInfoSelected(String id,
                                       ReactSuccessCallback callback,
                                       ReactErrorCallback errorCallback);

        public void onCompleteAnalysisSelected(String analysisId,
                                               String analysisName,
                                               ReactSuccessCallback callback,
                                               ReactErrorCallback errorCallback);

    }

    void setPresenter(Presenter presenter,
                      String baseDebugId,
                      Analysis selectedAnalysis);

    void load();
}
