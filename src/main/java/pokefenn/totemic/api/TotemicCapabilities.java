package pokefenn.totemic.api;

import java.util.Objects;

import javax.annotation.Nonnull;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import pokefenn.totemic.api.music.DefaultMusicAcceptor;
import pokefenn.totemic.api.music.MusicAcceptor;

/**
 * Provides Capabilities added by Totemic.
 */
public final class TotemicCapabilities {
    /**
     * Capability for {@link MusicAcceptor}.
     *
     * <p>
     * A reference implementation is provided by {@link DefaultMusicAcceptor}.
     */
    public static final @Nonnull Capability<MusicAcceptor> MUSIC_ACCEPTOR = Objects.requireNonNull(CapabilityManager.get(new CapabilityToken<>(){}));
}
