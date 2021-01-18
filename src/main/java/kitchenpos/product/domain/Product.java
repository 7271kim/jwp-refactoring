package kitchenpos.product.domain;

import kitchenpos.infra.Money;
import kitchenpos.converter.MoneyConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Convert(converter = MoneyConverter.class)
    @Column(nullable = false)
    private Money price;

    public Product() {
    }


    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

}