package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceAnalysis
 */
public class CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceAnalysis   {
  private String fraudModelSpecificationInstanceAnalysisReference = null;

  private String fraudModelSpecificationInstanceAnalysisReportType = null;

  private String fraudModelSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fraudModelSpecificationInstanceAnalysisReference
  **/

  public String getFraudModelSpecificationInstanceAnalysisReference() {
    return fraudModelSpecificationInstanceAnalysisReference;
  }

  public void setFraudModelSpecificationInstanceAnalysisReference(String fraudModelSpecificationInstanceAnalysisReference) {
    this.fraudModelSpecificationInstanceAnalysisReference = fraudModelSpecificationInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudModelSpecificationInstanceAnalysisReportType
  **/

  public String getFraudModelSpecificationInstanceAnalysisReportType() {
    return fraudModelSpecificationInstanceAnalysisReportType;
  }

  public void setFraudModelSpecificationInstanceAnalysisReportType(String fraudModelSpecificationInstanceAnalysisReportType) {
    this.fraudModelSpecificationInstanceAnalysisReportType = fraudModelSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fraudModelSpecificationInstanceAnalysisParameters
  **/

  public String getFraudModelSpecificationInstanceAnalysisParameters() {
    return fraudModelSpecificationInstanceAnalysisParameters;
  }

  public void setFraudModelSpecificationInstanceAnalysisParameters(String fraudModelSpecificationInstanceAnalysisParameters) {
    this.fraudModelSpecificationInstanceAnalysisParameters = fraudModelSpecificationInstanceAnalysisParameters;
  }


}

