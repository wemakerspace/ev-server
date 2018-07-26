package de.rwth.idsg.steve.repository.impl;

import de.rwth.idsg.steve.repository.dto.InsertConnectorStatusParams;
import de.rwth.idsg.steve.repository.dto.InsertTransactionParams;
import de.rwth.idsg.steve.repository.dto.UpdateChargeboxParams;
import de.rwth.idsg.steve.repository.dto.UpdateTransactionParams;
import ocpp.cs._2015._10.MeterValue;
import org.joda.time.DateTime;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 * @since 26.07.2018
 */
@Primary
@Repository
public class OcppServerRepositoryImplSynced extends OcppServerRepositoryImpl {

    @Override
    public synchronized void updateChargebox(UpdateChargeboxParams params) {
        super.updateChargebox(params);
    }

    @Override
    public synchronized void updateEndpointAddress(String chargeBoxIdentity, String endpointAddress) {
        super.updateEndpointAddress(chargeBoxIdentity, endpointAddress);
    }

    @Override
    public synchronized void updateChargeboxFirmwareStatus(String chargeBoxIdentity, String firmwareStatus) {
        super.updateChargeboxFirmwareStatus(chargeBoxIdentity, firmwareStatus);
    }

    @Override
    public synchronized void updateChargeboxDiagnosticsStatus(String chargeBoxIdentity, String status) {
        super.updateChargeboxDiagnosticsStatus(chargeBoxIdentity, status);
    }

    @Override
    public synchronized void updateChargeboxHeartbeat(String chargeBoxIdentity, DateTime ts) {
        super.updateChargeboxHeartbeat(chargeBoxIdentity, ts);
    }

    @Override
    public synchronized void insertConnectorStatus(InsertConnectorStatusParams params) {
        super.insertConnectorStatus(params);
    }

    @Override
    public synchronized void insertMeterValues(String chargeBoxIdentity, List<MeterValue> list,
                                               int connectorId, Integer transactionId) {
        super.insertMeterValues(chargeBoxIdentity, list, connectorId, transactionId);
    }

    @Override
    public synchronized void insertMeterValues(String chargeBoxIdentity, List<MeterValue> list,
                                               int transactionId) {
        super.insertMeterValues(chargeBoxIdentity, list, transactionId);
    }

    @Override
    public synchronized Integer insertTransaction(InsertTransactionParams params) {
        return super.insertTransaction(params);
    }

    @Override
    public synchronized void updateTransaction(UpdateTransactionParams params) {
        super.updateTransaction(params);
    }
}
