package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment
 */
public class BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment   {
  private BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration = null;


  /**
   * Get fraudModelDeploymentConfiguration
   * @return fraudModelDeploymentConfiguration
  **/

  public BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration getFraudModelDeploymentConfiguration() {
    return fraudModelDeploymentConfiguration;
  }

  public void setFraudModelDeploymentConfiguration(BQProductionRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration) {
    this.fraudModelDeploymentConfiguration = fraudModelDeploymentConfiguration;
  }


}

