package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_log_sincronizacao")
public class BriefingSynchronizationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_log")
    @JsonProperty("id_log")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_resposta")
    @JsonProperty("id_resposta")
    private BriefingResponse briefingResponse;

    @Column(name = "tabela_destino")
    @JsonProperty("tabela_destino")
    private String tableDestination;

    @Column(name = "campo_destino")
    @JsonProperty("campo_destino")
    private String columnDestination;

    @Column(name = "valor_antigo")
    @JsonProperty("valor_antigo")
    private String prevValue;

    @Column(name = "valor_novo")
    @JsonProperty("valor_novo")
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "atualizado_por")
    @JsonProperty("atualizado_por")
    private Employee employee;

    @Column(name = "data_execucao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_execucao")
    private LocalDate updateDate;

    public String getId() {
        return id;
    }

    public BriefingResponse getBriefingResponse() {
        return briefingResponse;
    }

    public void setBriefingResponse(BriefingResponse briefingResponse) {
        this.briefingResponse = briefingResponse;
    }

    public String getTableDestination() {
        return tableDestination;
    }

    public void setTableDestination(String tableDestination) {
        this.tableDestination = tableDestination;
    }

    public String getColumnDestination() {
        return columnDestination;
    }

    public void setColumnDestination(String columnDestination) {
        this.columnDestination = columnDestination;
    }

    public String getPrevValue() {
        return prevValue;
    }

    public void setPrevValue(String prevValue) {
        this.prevValue = prevValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}