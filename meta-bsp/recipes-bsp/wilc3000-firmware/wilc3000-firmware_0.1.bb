SUMMARY = "ATWILC3000 linux firmware and respective scripts and services to enable on Boot"
LICENSE = "CLOSED"

SRC_URI =  " \
    file://scripts/wifi-enable.sh \
    file://services/wifi-enable-service.service \
    file://scripts/wpa_supplicant.conf \
    file://mchp/* \
"

do_install () {
    install -d ${D}${bindir}
    install -m 0777 ${WORKDIR}/scripts/wifi-enable.sh ${D}${bindir}

    install -d ${D}${base_libdir}/firmware/mchp
    install -m 0644 ${WORKDIR}/mchp/* ${D}${base_libdir}/firmware/mchp/

    install -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${WORKDIR}/services/wifi-enable-service.service ${D}${systemd_unitdir}/system
    
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/scripts/wpa_supplicant.conf ${D}${sysconfdir}
}

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "wifi-enable-service.service"
SYSTEMD_AUTO_ENABLE_${PN} = "disable"

inherit allarch systemd

FILES_${PN} += "/lib/firmware/mchp/*"
FILES_${PN} += "${bindir}"
FILES_${PN} += "${systemd_unitdir}/system/"
FILES_${PN} += "${sysconfdir}"
