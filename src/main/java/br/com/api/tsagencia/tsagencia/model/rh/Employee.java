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

    @Column(length = 155, nullable = false)
    private String name;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthday;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CivilState civilState;

//    @Column(nullable = false)
//    @Enumerated(EnumType.STRING)
//    private Nacionality nacionality;

    @Column(length = 12, unique = true)
    private String rg;

    @Column(length = 14, unique = true)
    private String cpf;

    @Column(length = 155, nullable = false)
    private String email;

    @Column(length = 155, nullable = false)
    private String motherName;

    @Column(length = 19, nullable = false, unique = true) // +55 (14) 99769-2681
    private String phone;

    @Column(length = 155, nullable = false)
    private String city;

    @Column(length = 10, nullable = false)  // americano tem 10 no máximo e brasileiro tem 9
    private String postalCode;

    @Column(length = 155, nullable = false)
    private String street;

    @Column(length = 155, nullable = false)
    private String neighborhood;

    @Column(length = 14, unique = true) // coloquei o mesmo do cpf
    private String workCard;

    @Column(length = 14, unique = true)
    private String pisPasep;

    @Column(length = 9, nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeEmployment typeEmployment;

    @Column(length = 11, nullable = false)
    @Enumerated(EnumType.STRING)
    private LaborModality laborModality;

    @Column(length = 4, nullable = false)
    @Enumerated(EnumType.STRING)
    private LaborScale laborScale;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate admissionDate;

    @Column(length = 9, nullable = false, precision = 15, scale = 2)
    private BigDecimal salary;

    @Column
    private String residentialProve;

    @Column(nullable = false)
    private Boolean reservist;

    @Column
    private String documentation;

    @Column(length = 15, nullable = false)
    @Enumerated(EnumType.STRING)
    private Bank bank;

    @Column(length = 9, nullable = false) // americano -> 021000021    /   brasileiro -> 1234-5
    private String agency;

    @Column(length = 10, nullable = false, unique = true) // americano -> 1234567890   /   brasileiro -> 67890-1
    private String account;

    @Column(length = 155, nullable = false, unique = true)
    private String pix;

    @Column(nullable = false)
    private Boolean transportationVoucher;

    @Column(length = 18)
    private String cnpjTransportationVoucher;

    @Column(length = 9, precision = 15, scale = 2)
    private BigDecimal monthlyAmount;

    @Column
    private List<String> additionalDocuments;

    @Column(length = 24, nullable = false)
    @Enumerated(EnumType.STRING)
    private Department department;

    @Column(length = 3, nullable = false)
    @Enumerated(EnumType.STRING)
    private Operation operation;

    @Column(length = 9, nullable = false)
    @Enumerated(EnumType.STRING)
    private Level level;

    @Column(length = 8, nullable = false)
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

//    public Nacionality getNacionality() {
//        return nacionality;
//    }
//
//    public void setNacionality(Nacionality nacionality) {
//        this.nacionality = nacionality;
//    }

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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
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

    public BigDecimal getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(BigDecimal monthlyAmount) {
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