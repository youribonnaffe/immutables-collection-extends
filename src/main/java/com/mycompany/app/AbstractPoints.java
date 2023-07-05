package com.mycompany.app;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.immutables.value.Value;

@Value.Immutable
@Value.Enclosing
@Value.Style(
        visibility = Value.Style.ImplementationVisibility.SAME,
        typeImmutable = "*",
        typeAbstract = "Abstract*",
        depluralize = true )
public abstract class AbstractPoints {

    public abstract Map<Instant, List<? extends AbstractPoint>> pointsMap( );

    public abstract List<AbstractPoint> pointsList( );

    @Value.Immutable
    public abstract static class AbstractPoint {
        public abstract String value( );
    }

}
