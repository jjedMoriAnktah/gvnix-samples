package com.springsource.petclinic.web.dialog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.validation.FieldError;

/**
 * Bean holding data about the Dialog we want to render with the help
 * of <code>message-box.tagx</code> TAGx.
 *
 * <ul>
 *   <li>dialogType: informs about the type of the Dialog: Error, Alert, Info, Suggest.</li>
 *   <li>page: is the absolute path in app. context of the JSPx we want to include in
 *   the dialog. i.e: <code>/WEB-INF/views/myIncludedPage.jspx</code></li>
 *   <li>exception: Exception object to be shown in the dialog. The best idea is to show it
 *   in the included JSPx.</li>
 *   <li>title: short message to be shown in the dialog box. Must be a key of the i18n
 *   messages bundle</li>
 *   <li>description: large message to be shown in the dialog box. Must be a key of the i18n
 *   messages bundle</li>
 *   <li>params: Map with String as key and Object as value. Useful if other data is needed
 *   in the included JSPx</li>
 * </ul>
 *
 */
public class Dialog implements Serializable {

  /**
   * Serializable id
   */
  private static final long serialVersionUID = 1L;

  /**
   * Dialog type enumeration
   */
  public enum DialogType {
    Error, Info, Alert, Suggest;
  }

  private DialogType dialogType;

  private String page;

  private Exception exception;

  private String title;

  private String description;

  private Map<String, Object> params;

  private List<FieldError> errors;


  /**
   * Dialog bean constructor which loads data
   */
  public Dialog(DialogType dialogType, String page, Exception exception, String title, String description, Map<String, Object> params) {
    this.dialogType = dialogType;
    this.page = page;
    this.exception = exception;
    this.title = title;
    this.description = description;
    this.params = params;
  }

  /**
   * Dialog bean constructor which loads data
   */
  public Dialog(DialogType dialogType, String page, String title, String description, Map<String, Object> params) {
    this.dialogType = dialogType;
    this.page = page;
    this.title = title;
    this.description = description;
    this.params = params;
  }

  /**
   * Dialog bean constructor which loads data
   */
  public Dialog(DialogType dialogType, String title, String description, Map<String, Object> params) {
    this.dialogType = dialogType;
    this.title = title;
    this.description = description;
    this.params = params;
  }

  /**
   * Dialog bean constructor which loads data
   */
  public Dialog(DialogType dialogType, String title, String description, List<FieldError> errors) {
    this.dialogType = dialogType;
    this.title = title;
    this.description = description;
    this.errors = errors;
  }

  /**
   * Dialog bean constructor which loads data
   */
  public Dialog(DialogType dialogType, String title, String description) {
    this.dialogType = dialogType;
    this.title = title;
    this.description = description;
  }

  /**
   * Dialog bean constructor for exception
   */
  public Dialog(String page, Exception exception) {
    this.dialogType = DialogType.Error;
    this.page = page;
    this.exception = exception;
    this.title = "message_error_title";
  }

  /**
   * Informs dialog type
   */
  public DialogType getDialogType() {
    return dialogType;
  }

  /**
   * Sets dialog type
   */
  public void setDialogType(DialogType dialogType) {
    this.dialogType = dialogType;
  }

  /**
   * Returns dialog page
   */
  public String getPage() {
    return page;
  }
  /**
   * Sets dialog page
   */
  public void setPage(String page) {
    this.page = page;
  }

  /**
   * Gets dialog exception
   */
  public Exception getException() {
    return exception;
  }

  /**
   * Sets dialog exception
   */
  public void setException(Exception exception) {
    this.exception = exception;
  }

  public String getTitle() {
    return title;
  }

  /**
   * Gets dialog title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets dialog description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets dialog exception
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets dialog parameters
   */
  public Map<String, Object> getParams() {
    return params;
  }

  /**
   * Sets dialog parameters
   */
  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  /**
   * Gets dialog errors
   */
  public List<FieldError> getErrors() {
    return errors;
  }

  /**
   * Sets dialog errors
   */
  public void setErrors(List<FieldError> errors) {
    this.errors = errors;
  }

  @Override
  public String toString() {
    return "Dialog [dialogType=".concat(dialogType.name())
        .concat(", page=").concat(page)
        .concat(", exception=").concat(exception.toString())
        .concat(", title=").concat(title)
        .concat(", description=").concat(description)
        .concat(", params=").concat(params.toString()).concat("]");
  }

}
