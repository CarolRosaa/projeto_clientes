package io.github.CarolRosaa.repositry;

import io.github.CarolRosaa.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
