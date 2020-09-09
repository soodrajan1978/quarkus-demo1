// tag::adocBean[]
package io.quarkus.workshop.superheroes.fight.client;

import javax.validation.constraints.NotNull;


public class Villain {
	
	public long id;

    @NotNull
    public String name;
    public String otherName;
    @NotNull
    public int level;
    @NotNull
    public String picture;
    public String powers;

    @Override
    public String toString() {
        return "Villain{" +
            "name='" + name + '\'' +
            ", level=" + level +
            ", picture='" + picture + '\'' +
            ", powers='" + powers + '\'' +
            '}';
    }
}
