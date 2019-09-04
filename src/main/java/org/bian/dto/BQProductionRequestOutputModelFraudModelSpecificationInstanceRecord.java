package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment;

import javax.validation.Valid;
  
/**
 * BQProductionRequestOutputModelFraudModelSpecificationInstanceRecord
 */
public class BQProductionRequestOutputModelFraudModelSpecificationInstanceRecord   {
  private BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment fraudModelDeployment = null;

  private String fraudModelStatus = null;

  private String fraudModelUsage = null;

  private String fraudModelVersion = null;

  private String fraudModel = null;


  /**
   * Get fraudModelDeployment
   * @return fraudModelDeployment
  **/

  public BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment getFraudModelDeployment() {
    return fraudModelDeployment;
  }

  public void setFraudModelDeployment(BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment fraudModelDeployment) {
    this.fraudModelDeployment = fraudModelDeployment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The operational and development status of the model (e.g. under development, available, under review)  
   * @return fraudModelStatus
  **/

  public String getFraudModelStatus() {
    return fraudModelStatus;
  }

  public void setFraudModelStatus(String fraudModelStatus) {
    this.fraudModelStatus = fraudModelStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracking deployment and usage frequency  
   * @return fraudModelUsage
  **/

  public String getFraudModelUsage() {
    return fraudModelUsage;
  }

  public void setFraudModelUsage(String fraudModelUsage) {
    this.fraudModelUsage = fraudModelUsage;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The deployable model in any appropriate form (including historical versions as appropriate) 
   * @return fraudModel
  **/

  public String getFraudModel() {
    return fraudModel;
  }

  public void setFraudModel(String fraudModel) {
    this.fraudModel = fraudModel;
  }


}

