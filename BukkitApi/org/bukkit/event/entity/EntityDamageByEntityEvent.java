package org.bukkit.event.entity;

import java.util.Map;

import com.google.common.base.Function;
import org.bukkit.entity.Entity;

/**
 * 当一个实体受到另外一个实体伤害时触发该事件
 * 原文:
 * Called when an entity is damaged by an entity
 */
public class EntityDamageByEntityEvent extends EntityDamageEvent {
    private final Entity damager;

    @Deprecated
    public EntityDamageByEntityEvent(final Entity damager, final Entity damagee, final DamageCause cause, final int damage) {
        this(damager, damagee, cause, (double) damage);
    }

    @Deprecated
    public EntityDamageByEntityEvent(final Entity damager, final Entity damagee, final DamageCause cause, final double damage) {
        super(damagee, cause, damage);
        this.damager = damager;
    }

    public EntityDamageByEntityEvent(final Entity damager, final Entity damagee, final DamageCause cause, final Map<DamageModifier, Double> modifiers, final Map<DamageModifier, ? extends Function<? super Double, Double>> modifierFunctions) {
        super(damagee, cause, modifiers, modifierFunctions);
        this.damager = damager;
    }

    /**
     * 返回造成这次伤害的实体 (Entity)类
     * 
     * @return 造成这次伤害的实体 (Entity)类
     * 原文:
     * Returns the entity that damaged the defender.
     *
     * @return Entity that damaged the defender.
     */
    public Entity getDamager() {
        return damager;
    }
}
