package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceReport
 */
public class BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceReport   {
  private String functionalRequirementsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return functionalRequirementsInstanceReportReference
  **/

  public String getFunctionalRequirementsInstanceReportReference() {
    return functionalRequirementsInstanceReportReference;
  }

  public void setFunctionalRequirementsInstanceReportReference(String functionalRequirementsInstanceReportReference) {
    this.functionalRequirementsInstanceReportReference = functionalRequirementsInstanceReportReference;
  }


}

