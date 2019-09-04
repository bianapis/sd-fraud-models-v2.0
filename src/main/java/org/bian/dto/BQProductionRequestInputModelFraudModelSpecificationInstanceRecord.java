package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment;

import javax.validation.Valid;
  
/**
 * BQProductionRequestInputModelFraudModelSpecificationInstanceRecord
 */
public class BQProductionRequestInputModelFraudModelSpecificationInstanceRecord   {
  private BQProductionRequestInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment fraudModelDeployment = null;

  private String fraudModelVersion = null;


  /**
   * Get fraudModelDeployment
   * @return fraudModelDeployment
  **/

  public BQProductionRequestInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment getFraudModelDeployment() {
    return fraudModelDeployment;
  }

  public void setFraudModelDeployment(BQProductionRequestInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment fraudModelDeployment) {
    this.fraudModelDeployment = fraudModelDeployment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Release version of available model plus version history as appropriate 
   * @return fraudModelVersion
  **/

  public String getFraudModelVersion() {
    return fraudModelVersion;
  }

  public void setFraudModelVersion(String fraudModelVersion) {
    this.fraudModelVersion = fraudModelVersion;
  }


}

