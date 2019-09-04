package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport
 */
public class BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceReport   {
  private Object functionalRequirementsInstanceReportRecord = null;

  private String functionalRequirementsInstanceReportType = null;

  private String functionalRequirementsInstanceReportParameters = null;

  private Object functionalRequirementsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return functionalRequirementsInstanceReportRecord
  **/

  public Object getFunctionalRequirementsInstanceReportRecord() {
    return functionalRequirementsInstanceReportRecord;
  }

  public void setFunctionalRequirementsInstanceReportRecord(Object functionalRequirementsInstanceReportRecord) {
    this.functionalRequirementsInstanceReportRecord = functionalRequirementsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return functionalRequirementsInstanceReportType
  **/

  public String getFunctionalRequirementsInstanceReportType() {
    return functionalRequirementsInstanceReportType;
  }

  public void setFunctionalRequirementsInstanceReportType(String functionalRequirementsInstanceReportType) {
    this.functionalRequirementsInstanceReportType = functionalRequirementsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return functionalRequirementsInstanceReportParameters
  **/

  public String getFunctionalRequirementsInstanceReportParameters() {
    return functionalRequirementsInstanceReportParameters;
  }

  public void setFunctionalRequirementsInstanceReportParameters(String functionalRequirementsInstanceReportParameters) {
    this.functionalRequirementsInstanceReportParameters = functionalRequirementsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return functionalRequirementsInstanceReport
  **/

  public Object getFunctionalRequirementsInstanceReport() {
    return functionalRequirementsInstanceReport;
  }

  public void setFunctionalRequirementsInstanceReport(Object functionalRequirementsInstanceReport) {
    this.functionalRequirementsInstanceReport = functionalRequirementsInstanceReport;
  }


}

