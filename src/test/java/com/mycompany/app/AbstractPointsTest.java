package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class AbstractPointsTest {

    @Test
    void nested_points_implementation_can_be_used_in_builder( ) {
        Map<Instant, List<Points.Point>> points = Map.of( );
        var payload = Points.builder( )
                .pointsMap( points )
                .build( );

        assertNotNull( payload );
    }

    @Test
    void points_implementation_can_be_used_in_builder( ) {
        List<Points.Point> points = List.of( );
        var payload = Points.builder( )
                .pointsList( points )
                .build( );

        assertNotNull( payload );
    }

    @Test
    void nested_points_abstract_class_can_be_used_in_builder( ) {
        Map<Instant, List<AbstractPoints.AbstractPoint>> points = Map.of( );
        var payload = Points.builder( )
                .pointsMap( points )
                .build( );

        assertNotNull( payload );
    }

    @Test
    void points_abstract_class_can_be_used_in_builder( ) {
        List<AbstractPoints.AbstractPoint> points = List.of( );
        var payload = Points.builder( )
                .pointsList( points )
                .build( );

        assertNotNull( payload );
    }

}