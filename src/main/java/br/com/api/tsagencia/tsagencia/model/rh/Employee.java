package br.com.api.tsagencia.tsagencia.model.rh;

import br.com.api.tsagencia.tsagencia.model.rh.enums.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "t_colaborador")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private String id;

    @Column
    private String name;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthday;

    @Column
    @Enumerated(EnumType.STRING)
    private CivilState civilState;

    @Column
    @Enumerated(EnumType.STRING)
    private Nacionality nacionality;

    @Column
    private String rg;

    @Column(unique = true)
    private String cpf;

    @Column
    private String email;

    @Column
    private String motherName;

    @Column
    private String phone;

    @Column
    private String city;

    @Column
    private String postalCode;

    @Column
    private String street;

    @Column
    private String neighborhood;

    @Column
    private String workCard;

    @Column
    private String pisPasep;

    @Column
    @Enumerated(EnumType.STRING)
    private TypeEmployment typeEmployment;

    @Column
    @Enumerated(EnumType.STRING)
    private LaborModality laborModality;

    @Column
    @Enumerated(EnumType.STRING)
    private LaborScale laborScale;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate admissionDate;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal salary;

    @Column
    private String residentialProve;

    @Column
    private Boolean reservist;

    @Column
    private String documentation;

    @Column
    @Enumerated(EnumType.STRING)
    private Bank bank;

    @Column
    private Integer agency;

    @Column
    private String account;

    @Column
    private String pix;

    @Column
    private Boolean transportationVoucher;

    @Column
    private String cnpjTransportationVoucher;

    @Column
    private Integer monthlyAmount;

    @Column
    private List<String> additionalDocuments;

    @Column
    @Enumerated(EnumType.STRING)
    private Department department;

    @Column
    @Enumerated(EnumType.STRING)
    private Operation operation;

    @Column
    @Enumerated(EnumType.STRING)
    private Level level;

    @Column
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate quitDate;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public CivilState getCivilState() {
        return civilState;
    }

    public void setCivilState(CivilState civilState) {
        this.civilState = civilState;
    }

    public Nacionality getNacionality() {
        return nacionality;
    }

    public void setNacionality(Nacionality nacionality) {
        this.nacionality = nacionality;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getWorkCard() {
        return workCard;
    }

    public void setWorkCard(String workCard) {
        this.workCard = workCard;
    }

    public String getPisPasep() {
        return pisPasep;
    }

    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep;
    }

    public TypeEmployment getTypeEmployment() {
        return typeEmployment;
    }

    public void setTypeEmployment(TypeEmployment typeEmployment) {
        this.typeEmployment = typeEmployment;
    }

    public LaborModality getLaborModality() {
        return laborModality;
    }

    public void setLaborModality(LaborModality laborModality) {
        this.laborModality = laborModality;
    }

    public LaborScale getLaborScale() {
        return laborScale;
    }

    public void setLaborScale(LaborScale laborScale) {
        this.laborScale = laborScale;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getResidentialProve() {
        return residentialProve;
    }

    public void setResidentialProve(String residentialProve) {
        this.residentialProve = residentialProve;
    }

    public Boolean getReservist() {
        return reservist;
    }

    public void setReservist(Boolean reservist) {
        this.reservist = reservist;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public Boolean getTransportationVoucher() {
        return transportationVoucher;
    }

    public void setTransportationVoucher(Boolean transportationVoucher) {
        this.transportationVoucher = transportationVoucher;
    }

    public String getCnpjTransportationVoucher() {
        return cnpjTransportationVoucher;
    }

    public void setCnpjTransportationVoucher(String cnpjTransportationVoucher) {
        this.cnpjTransportationVoucher = cnpjTransportationVoucher;
    }

    public Integer getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(Integer monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public List<String> getAdditionalDocuments() {
        return additionalDocuments;
    }

    public void setAdditionalDocuments(List<String> additionalDocuments) {
        this.additionalDocuments = additionalDocuments;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(LocalDate quitDate) {
        this.quitDate = quitDate;
    }
}