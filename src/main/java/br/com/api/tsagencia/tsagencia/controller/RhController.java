package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.rh.*;
import br.com.api.tsagencia.tsagencia.service.RhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rh")
public class RhController {
    @Autowired
    private RhService service;

    @GetMapping(value = "/allEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }

    @PostMapping(
            value = "/saveEmployee",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping(value = "/allEmployeeAllocation", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeAllocation> getAllEmployeeAllocation() {
        return service.getAllEmployeeAllocation();
    }

    @PostMapping(
            value = "/saveEmployeeAllocation",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeAllocation saveEmployeeAllocation(@RequestBody EmployeeAllocation employeeAllocation) {
        return service.saveEmployeeAllocation(employeeAllocation);
    }

    @GetMapping(value = "/allEmployeeBriefing", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeBriefing> getAllEmployeeBriefing() {
        return service.getAllEmployeeBriefing();
    }

    @PostMapping(
            value = "/saveEmployeeBriefing",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeBriefing saveEmployeeBriefing(@RequestBody EmployeeBriefing employeeBriefing) {
        return service.saveEmployeeBriefing(employeeBriefing);
    }

    @GetMapping(value = "/allEmployeeContract", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeContract> getAllEmployeeContract() {
        return service.getAllEmployeeContract();
    }

    @PostMapping(
            value = "/saveEmployeeContract",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeContract saveEmployeeContract(@RequestBody EmployeeContract employeeContract) {
        return service.saveEmployeeContract(employeeContract);
    }

    @GetMapping(value = "/allEmployeeEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeEmail> getAllEmployeeEmail() {
        return service.getAllEmployeeEmail();
    }

    @PostMapping(
            value = "/saveEmployeeEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeEmail saveEmployeeEmail(@RequestBody EmployeeEmail employeeEmail) {
        return service.saveEmployeeEmail(employeeEmail);
    }

    @GetMapping(value = "/allEmployeePhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeePhone> getAllEmployeePhone() {
        return service.getAllEmployeePhone();
    }

    @PostMapping(
            value = "/saveEmployeePhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeePhone saveEmployeePhone(@RequestBody EmployeePhone employeePhone) {
        return service.saveEmployeePhone(employeePhone);
    }

    @GetMapping(value = "/allOrganizationalUnit", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrganizationalUnit> getAllOrganizationalUnit() {
        return service.getAllOrganizationalUnit();
    }

    @PostMapping(
            value = "/saveOrganizationalUnit",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrganizationalUnit saveOrganizationalUnit(@RequestBody OrganizationalUnit organizationalUnit) {
        return service.saveOrganizationalUnit(organizationalUnit);
    }
}