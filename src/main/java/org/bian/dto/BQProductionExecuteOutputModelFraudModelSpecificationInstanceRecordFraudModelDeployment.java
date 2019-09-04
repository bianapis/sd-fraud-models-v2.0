package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment
 */
public class BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment   {
  private BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration = null;


  /**
   * Get fraudModelDeploymentConfiguration
   * @return fraudModelDeploymentConfiguration
  **/

  public BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration getFraudModelDeploymentConfiguration() {
    return fraudModelDeploymentConfiguration;
  }

  public void setFraudModelDeploymentConfiguration(BQProductionExecuteOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration) {
    this.fraudModelDeploymentConfiguration = fraudModelDeploymentConfiguration;
  }


}

