// First Chart Example - Area Line Chart

Morris.Area({
    // ID of the element in which to draw the chart.
    element: 'morris-chart-area',
    // Chart data records -- each entry in this array corresponds to a point on
    // the chart.
    data: [
        {d: '2013-06', visits: 80},
        {d: '2013-07', visits: 78},
        {d: '2013-08', visits: 82},
        {d: '2013-09', visits: 83},
        {d: '2013-10', visits: 79},
        {d: '2013-11', visits: 85},
        {d: '2013-12', visits: 79},
        {d: '2014-01', visits: 80},
        {d: '2014-02', visits: 92},
        {d: '2014-03', visits: 42},
        {d: '2014-04', visits: 88},
        {d: '2014-05', visits: 88},
        {d: '2014-06', visits: 81},
        {d: '2014-07', visits: 84},
        {d: '2014-08', visits: 87},
        {d: '2014-09', visits: 63},
        {d: '2014-10', visits: 92},
        {d: '2014-11', visits: 88},
        {d: '2014-12', visits: 88},
        {d: '2015-01', visits: 84},
        {d: '2015-02', visits: 75},
        {d: '2015-03', visits: 90},
        {d: '2015-04', visits: 75},
        {d: '2015-05', visits: 93},
        {d: '2015-06', visits: 83},
        {d: '2015-07', visits: 88},
        {d: '2015-08', visits: 86},
        {d: '2015-09', visits: 90},
        {d: '2015-10', visits: 77},
        {d: '2015-11', visits: 71},
        {d: '2015-12', visits: 92},
    ],
    // The name of the data record attribute that contains x-visitss.
    xkey: 'd',
    // A list of names of data record attributes that contain y-visitss.
    ykeys: ['visits'],
    // Labels for the ykeys -- will be displayed when you hover over the
    // chart.
    labels: ['分数'],
    // Disables line smoothing
    smooth: false
});

Morris.Donut({
    element: 'morris-chart-donut',
    data: [
        {label: "硬性绩效", value: 42.7},
        {label: "团体活动", value: 8.3},
        {label: "人民满意度", value: 12.8},
        {label: "特色活动", value: 36.2}
    ],
    formatter: function (y) {
        return y + "%";
    }
});

Morris.Line({
    // ID of the element in which to draw the chart.
    element: 'morris-chart-line',
    // Chart data records -- each entry in this array corresponds to a point on
    // the chart.
    data: [
        {d: '2013-06', visits: 80},
        {d: '2013-07', visits: 78},
        {d: '2013-08', visits: 82},
        {d: '2013-09', visits: 83},
        {d: '2013-10', visits: 79},
        {d: '2013-11', visits: 85},
        {d: '2013-12', visits: 79},
        {d: '2014-01', visits: 80},
        {d: '2014-02', visits: 92},
        {d: '2014-03', visits: 42},
        {d: '2014-04', visits: 88},
        {d: '2014-05', visits: 88},
        {d: '2014-06', visits: 81},
        {d: '2014-07', visits: 84},
        {d: '2014-08', visits: 87},
        {d: '2014-09', visits: 63},
        {d: '2014-10', visits: 92},
        {d: '2014-11', visits: 88},
        {d: '2014-12', visits: 88},
        {d: '2015-01', visits: 84},
        {d: '2015-02', visits: 75},
        {d: '2015-03', visits: 90},
        {d: '2015-04', visits: 75},
        {d: '2015-05', visits: 93},
        {d: '2015-06', visits: 83},
        {d: '2015-07', visits: 88},
        {d: '2015-08', visits: 86},
        {d: '2015-09', visits: 90},
        {d: '2015-10', visits: 77},
        {d: '2015-11', visits: 71},
        {d: '2015-12', visits: 92},
    ],
    // The name of the data record attribute that contains x-visitss.
    xkey: 'd',
    // A list of names of data record attributes that contain y-visitss.
    ykeys: ['visits'],
    // Labels for the ykeys -- will be displayed when you hover over the
    // chart.
    labels: ['Visits'],
    // Disables line smoothing
    smooth: false
});

Morris.Bar({
    element: 'morris-chart-bar',
    data: [
        {device: 'iPhone', geekbench: 136},
        {device: 'iPhone 3G', geekbench: 137},
        {device: 'iPhone 3GS', geekbench: 275},
        {device: 'iPhone 4', geekbench: 380},
        {device: 'iPhone 4S', geekbench: 655},
        {device: 'iPhone 5', geekbench: 1571}
    ],
    xkey: 'device',
    ykeys: ['geekbench'],
    labels: ['Geekbench'],
    barRatio: 0.4,
    xLabelAngle: 35,
    hideHover: 'auto'
});
