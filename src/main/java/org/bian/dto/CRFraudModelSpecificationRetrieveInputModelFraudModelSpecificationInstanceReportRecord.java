package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceReportRecord
 */
public class CRFraudModelSpecificationRetrieveInputModelFraudModelSpecificationInstanceReportRecord   {
  private String fraudModelSpecificationInstanceReportReference = null;

  private String fraudModelSpecificationInstanceReportType = null;

  private String fraudModelSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fraudModelSpecificationInstanceReportReference
  **/

  public String getFraudModelSpecificationInstanceReportReference() {
    return fraudModelSpecificationInstanceReportReference;
  }

  public void setFraudModelSpecificationInstanceReportReference(String fraudModelSpecificationInstanceReportReference) {
    this.fraudModelSpecificationInstanceReportReference = fraudModelSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudModelSpecificationInstanceReportType
  **/

  public String getFraudModelSpecificationInstanceReportType() {
    return fraudModelSpecificationInstanceReportType;
  }

  public void setFraudModelSpecificationInstanceReportType(String fraudModelSpecificationInstanceReportType) {
    this.fraudModelSpecificationInstanceReportType = fraudModelSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fraudModelSpecificationInstanceReportParameters
  **/

  public String getFraudModelSpecificationInstanceReportParameters() {
    return fraudModelSpecificationInstanceReportParameters;
  }

  public void setFraudModelSpecificationInstanceReportParameters(String fraudModelSpecificationInstanceReportParameters) {
    this.fraudModelSpecificationInstanceReportParameters = fraudModelSpecificationInstanceReportParameters;
  }


}

