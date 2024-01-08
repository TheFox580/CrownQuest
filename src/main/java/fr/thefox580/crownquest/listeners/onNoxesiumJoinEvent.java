package fr.thefox580.crownquest.listeners;

import com.noxcrew.noxesium.api.protocol.rule.ServerRuleIndices;
import me.superneon4ik.noxesiumutils.NoxesiumUtils;
import me.superneon4ik.noxesiumutils.events.NoxesiumPlayerJoinEvent;
import me.superneon4ik.noxesiumutils.network.clientbound.ClientboundChangeServerRulesPacket;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.List;

public class onNoxesiumJoinEvent implements Listener {

    @EventHandler
    public void onNoxesiumJoinEvent(NoxesiumPlayerJoinEvent event){
        Player player = event.getPlayer();

        var noTridentCollision = NoxesiumUtils.getManager().<Boolean>getServerRule(player, ServerRuleIndices.DISABLE_SPIN_ATTACK_COLLISIONS);
        noTridentCollision.setValue(true);
        new ClientboundChangeServerRulesPacket(List.of(noTridentCollision)).send(player);

        var noBoatCollision = NoxesiumUtils.getManager().<Boolean>getServerRule(player, ServerRuleIndices.DISABLE_BOAT_COLLISIONS);
        noBoatCollision.setValue(true);
        new ClientboundChangeServerRulesPacket(List.of(noBoatCollision)).send(player);
    }

}
