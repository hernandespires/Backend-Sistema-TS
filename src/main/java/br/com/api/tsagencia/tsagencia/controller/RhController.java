package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.rh.*;
import br.com.api.tsagencia.tsagencia.service.RhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rh")
public class RhController {
    @Autowired
    private RhService service;

    @GetMapping(name = "/allEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }

    @PostMapping(
            name = "/saveEmployee",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Employee saveEmployee(Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeAllocation> getAllEmployeeAllocation() {
        return service.getAllEmployeeAllocation();
    }

    @PostMapping(
            name = "/saveEmployeeAllocation",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeAllocation saveEmployeeAllocation(EmployeeAllocation employeeAllocation) {
        return service.saveEmployeeAllocation(employeeAllocation);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeBriefing> getAllEmployeeBriefing() {
        return service.getAllEmployeeBriefing();
    }

    @PostMapping(
            name = "/saveEmployeeBriefing",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeBriefing saveEmployeeBriefing(EmployeeBriefing employeeBriefing) {
        return service.saveEmployeeBriefing(employeeBriefing);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeContract> getAllEmployeeContract() {
        return service.getAllEmployeeContract();
    }

    @PostMapping(
            name = "/saveEmployeeContract",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeContract saveEmployeeContract(EmployeeContract employeeContract) {
        return service.saveEmployeeContract(employeeContract);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeEmail> getAllEmployeeEmail() {
        return service.getAllEmployeeEmail();
    }

    @PostMapping(
            name = "/saveEmployeeEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeEmail saveEmployeeEmail(EmployeeEmail employeeEmail) {
        return service.saveEmployeeEmail(employeeEmail);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeePhone> getAllEmployeePhone() {
        return service.getAllEmployeePhone();
    }

    @PostMapping(
            name = "/saveEmployeePhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeePhone saveEmployeePhone(EmployeePhone employeePhone) {
        return service.saveEmployeePhone(employeePhone);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrganizationalUnit> getAllOrganizationalUnit() {
        return service.getAllOrganizationalUnit();
    }

    @PostMapping(
            name = "/saveOrganizationalUnit",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrganizationalUnit saveOrganizationalUnit(OrganizationalUnit organizationalUnit) {
        return service.saveOrganizationalUnit(organizationalUnit);
    }
}