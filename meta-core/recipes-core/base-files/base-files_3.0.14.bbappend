FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append = "file://rbissue.net \ 
                    file://rbissue \
"
addtask before_pkg before do_package after do_install

do_before_pkg() {
	install -m 644 ${WORKDIR}/rbissue.net  ${D}${sysconfdir}/issue.net
	install -m 644 ${WORKDIR}/rbissue  ${D}${sysconfdir}/issue
}
